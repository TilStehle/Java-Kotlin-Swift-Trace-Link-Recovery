package actions.psiutils;

import com.intellij.psi.*;
import de.unihamburg.masterprojekt2016.traceability.*;
import org.jetbrains.kotlin.psi.*;

/**
 * Created by Tilmann Stehle on 02.12.2016.
 */
public class TraceabilityPointerCreator {
    public static TraceabilityPointer getPointerForPsiElement(PsiElement psiElement) {
        TraceabilityPointer result = null;
        if (psiElement instanceof PsiMethod) {
            PsiMethod method = (PsiMethod) psiElement;
            if (method.isConstructor()) {
                String className = method.getName();
                PsiClass containingClass = method.getContainingClass();
                String filePath = containingClass.getContainingFile().getVirtualFile().getCanonicalPath();
                TypePointer typePointer = new TypePointer(containingClass.getQualifiedName());
                TypePointerClassification typeClassification = getTypeClassifierForClass(containingClass);
                typePointer.setClassification(typeClassification);
                typePointer.setSourceFilePath(filePath);
                ConstructorPointer constructorPointer = new ConstructorPointer(className, typePointer, filePath);

                for (PsiParameter psiParameter : method.getParameterList().getParameters()) {
                    constructorPointer.addParameter(new Parameter(psiParameter.getName(), psiParameter.getType().getPresentableText()));
                }

                constructorPointer.setTypePointer(typePointer);
                result = constructorPointer;

            } else {
                String methodName = method.getName();
                MethodPointer methodPointer = new MethodPointer(methodName);
                methodPointer.setReturnType(method.getReturnType().getPresentableText());
                PsiClass containingClass = method.getContainingClass();
                for (PsiParameter psiParameter : method.getParameterList().getParameters()) {
                    methodPointer.addParameter(new Parameter(psiParameter.getName(), psiParameter.getType().getPresentableText()));
                }
                String filePath = containingClass.getContainingFile().getVirtualFile().getCanonicalPath();
                TypePointer typePointer = new TypePointer(containingClass.getQualifiedName());
                TypePointerClassification typeClassification = getTypeClassifierForClass(containingClass);
                typePointer.setClassification(typeClassification);
                typePointer.setSourceFilePath(filePath);
                methodPointer.setTypePointer(typePointer);
                result = methodPointer;
            }

        } else if (psiElement instanceof PsiClass) {
            PsiClass psiClass = (PsiClass) psiElement;
            String className = psiClass.getName();
            TypePointer classPointer = new TypePointer(psiClass.getQualifiedName());
            classPointer.setClassification(getTypeClassifierForClass(psiClass));
            String filePath = psiClass.getContainingFile().getVirtualFile().getCanonicalPath();
            classPointer.setSourceFilePath(filePath);
            result = classPointer;
        } else if (psiElement instanceof PsiField) {
            PsiClass containingClass = ((PsiField) psiElement).getContainingClass();
            String className = containingClass.getName();
            TypePointer classPointer = new TypePointer(containingClass.getQualifiedName());
            classPointer.setClassification(getTypeClassifierForClass(containingClass));
            String filePath = containingClass.getContainingFile().getVirtualFile().getCanonicalPath();
            classPointer.setSourceFilePath(filePath);
            PsiField psiField = (PsiField) psiElement;
            String attributeType = psiField.getType().getPresentableText();
            result = new AttributePointer(psiField.getName(), classPointer, filePath, attributeType);

        } else if (psiElement instanceof KtClass) {
            KtClass psiClass = (KtClass) psiElement;
            String className = psiClass.getName();
            TypePointer classPointer = new TypePointer(psiClass.getFqName().asString());
            classPointer.setClassification(getTypeClassifierForClass(psiClass));
            String filePath = psiClass.getContainingFile().getVirtualFile().getCanonicalPath();
            classPointer.setSourceFilePath(filePath);
            result = classPointer;
        } else if (psiElement instanceof KtConstructor) {
            KtConstructor constructor = (KtConstructor) psiElement;

            String className = constructor.getName();
            KtClassOrObject containingClass = constructor.getContainingClassOrObject();
            String filePath = containingClass.getContainingFile().getVirtualFile().getCanonicalPath();
            TypePointer typePointer = new TypePointer(containingClass.getFqName().asString());
            TypePointerClassification typeClassification = getTypeClassifierForClass(containingClass);
            typePointer.setClassification(typeClassification);
            typePointer.setSourceFilePath(filePath);
            ConstructorPointer constructorPointer = new ConstructorPointer(className, typePointer, filePath);

            for (KtParameter psiParameter : constructor.getValueParameterList().getParameters()) {
                constructorPointer.addParameter(new Parameter(psiParameter.getName(),psiParameter.getTypeReference().getText()));
            }

            constructorPointer.setTypePointer(typePointer);
            result = constructorPointer;
        } else if (psiElement instanceof KtNamedFunction) {
            KtNamedFunction method = (KtNamedFunction) psiElement;
            String methodName = method.getName();
            MethodPointer methodPointer = new MethodPointer(methodName);
            if(method.hasDeclaredReturnType())
            {
                String returnType=method.getTypeReference().getText();
                methodPointer.setReturnType(returnType);
            }
            else
            {
                methodPointer.setReturnType("void");
            }
            String filePath = method.getContainingFile().getVirtualFile().getCanonicalPath();
            methodPointer.setSourceFilePath(filePath);
            TypePointer typePointer;
            if (method.getParent() instanceof KtClassBody) {
                KtClass containingClass = PsiUtils.iterateToParentOfType(KtClass.class, method);
                typePointer = new TypePointer(containingClass.getFqName().asString());
                typePointer.setClassification(TypePointerClassification.CLASS);
                typePointer.setSourceFilePath(filePath);
                methodPointer.setTypePointer(typePointer);
            }


            for (KtParameter psiParameter : method.getValueParameterList().getParameters()) {
                methodPointer.addParameter(new Parameter(psiParameter.getName(), psiParameter.getTypeReference().getText()));
            }
            result = methodPointer;
        } else if (psiElement instanceof KtProperty) {
            KtProperty property = (KtProperty) psiElement;
            TypePointer typePointer=null;
            String filePath = property.getContainingFile().getVirtualFile().getCanonicalPath();
            if (property.getParent() instanceof KtClassBody) {
                KtClass containingClass = PsiUtils.iterateToParentOfType(KtClass.class, property);
                typePointer = new TypePointer(containingClass.getFqName().asString());
                typePointer.setClassification(TypePointerClassification.CLASS);
                typePointer.setSourceFilePath(filePath);
            }
            String typeName = property.getTypeReference().getText();
            System.out.println(typeName);
            result = new AttributePointer(property.getName(), typePointer, filePath, typeName);

        }


        return result;

    }

    private static TypePointerClassification getTypeClassifierForClass(KtClass psiClass) {
        if (psiClass.isEnum()) {
            return TypePointerClassification.ENUM;
        } else if (psiClass.isInterface()) {
            return TypePointerClassification.INTERFACE;
        } else {
            return TypePointerClassification.CLASS;
        }

    }

    private static TypePointerClassification getTypeClassifierForClass(KtClassOrObject psiClass) {
        if (psiClass instanceof KtClass) {
            return getTypeClassifierForClass((KtClass) psiClass);
        } else return TypePointerClassification.CLASS;
    }

    private static TypePointerClassification getTypeClassifierForClass(PsiClass psiClass) {
        if (psiClass.isEnum()) {
            return TypePointerClassification.ENUM;
        } else if (psiClass instanceof PsiAnonymousClass) {
            return TypePointerClassification.ANONYMOUS_CLASS;
        } else if (psiClass.isInterface()) {
            return TypePointerClassification.INTERFACE;
        } else if (psiClass.getContainingClass() != null) {
            return TypePointerClassification.INNER_CLASS;
        } else {
            return TypePointerClassification.CLASS;
        }

    }
}
