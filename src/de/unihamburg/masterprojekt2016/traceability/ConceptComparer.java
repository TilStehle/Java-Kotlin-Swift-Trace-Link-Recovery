package de.unihamburg.masterprojekt2016.traceability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tilmann Stehle on 22.02.2017.
 */
public class ConceptComparer {
    public static final float LOWCONCEPTSIMILARITY = 0.3f;
    public static final float HIGHCONCEPTSIMILARITY = 0.8f;
    public static final float IDENTICALCONCEPTSIMILARITY = 1f;
    
    public static final String LOCAL_VARIABLE = "LocalVariable";
    public static final String PARAMETER = "Parameter";
    
    private static Map<String, List<ConceptTypeSimilarity>> similarityMap = new HashMap<>();
    private static Map<String, Float> conceptWeightMap = new HashMap<>();

    private static void addSimilarities(String sourceConcept, boolean isType) {
        List<ConceptTypeSimilarity> similarities = new ArrayList<>();
        ConceptTypeSimilarity selfSimilarity = new ConceptTypeSimilarity(sourceConcept, sourceConcept, 1);
        similarities.add(selfSimilarity);
        ConceptTypeSimilarity similarityToAttribute = new ConceptTypeSimilarity(sourceConcept, AttributePointer.ATTRIBUTE, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToConstructor = new ConceptTypeSimilarity(sourceConcept, ConstructorPointer.CONSTRUCTOR, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToFile = new ConceptTypeSimilarity(sourceConcept, FilePointer.FILE, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToMethod = new ConceptTypeSimilarity(sourceConcept, MethodPointer.METHOD, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToPackage = new ConceptTypeSimilarity(sourceConcept, PackagePointer.PACKAGE, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToSubscript = new ConceptTypeSimilarity(sourceConcept, MethodPointer.METHOD, LOWCONCEPTSIMILARITY);
        ConceptTypeSimilarity similarityToXMLElement = new ConceptTypeSimilarity(sourceConcept, XmlElementDeclPointer.XML_ELEMENT, LOWCONCEPTSIMILARITY);


        for (TypePointerClassification typeClassification : TypePointerClassification.values()) {
            float typeSimilarity = LOWCONCEPTSIMILARITY;
            if (isType) {
                typeSimilarity = HIGHCONCEPTSIMILARITY;
            }
            ConceptTypeSimilarity similarityToType = new ConceptTypeSimilarity(sourceConcept, typeClassification.toString(), typeSimilarity);
            addSimilarityIfNotSelfReferencing(similarityToType, similarities);
        }
        addSimilarityIfNotSelfReferencing(similarityToAttribute, similarities);
        addSimilarityIfNotSelfReferencing(similarityToAttribute, similarities);
        addSimilarityIfNotSelfReferencing(similarityToConstructor, similarities);
        addSimilarityIfNotSelfReferencing(similarityToFile, similarities);
        addSimilarityIfNotSelfReferencing(similarityToMethod, similarities);
        addSimilarityIfNotSelfReferencing(similarityToPackage, similarities);
        addSimilarityIfNotSelfReferencing(similarityToSubscript, similarities);
        addSimilarityIfNotSelfReferencing(similarityToXMLElement, similarities);
        similarityMap.put(sourceConcept, similarities);

    }


    private static void addSimilarityIfNotSelfReferencing(ConceptTypeSimilarity similarity, List<ConceptTypeSimilarity> similarities) {
        if (!similarity.getFirstConceptType().equals(similarity.getSecondConceptType())) {
            similarities.add(similarity);
        }
    }

    static {
        addSimilarities(AttributePointer.ATTRIBUTE, false);
        addSimilarities(ConstructorPointer.CONSTRUCTOR, false);
        addSimilarities(FilePointer.FILE, false);
        addSimilarities(MethodPointer.METHOD, false);
        addSimilarities(PackagePointer.PACKAGE, false);
        addSimilarities(SubscriptPointer.SUBSCRIPT, false);
        addSimilarities(XmlElementDeclPointer.XML_ELEMENT, false);
        addSimilarities(ConceptComparer.LOCAL_VARIABLE, false);
        for (TypePointerClassification typeClassification : TypePointerClassification.values()) {

            addSimilarities(typeClassification.toString(), true);
        }


float low=1.0f;
float medium=5;
float high=10;
        conceptWeightMap.put(PackagePointer.PACKAGE, low);
        conceptWeightMap.put(ConceptComparer.LOCAL_VARIABLE, low);
        conceptWeightMap.put(SubscriptPointer.SUBSCRIPT, medium);
        conceptWeightMap.put(AttributePointer.ATTRIBUTE, medium);
        conceptWeightMap.put(ConstructorPointer.CONSTRUCTOR, medium);
        conceptWeightMap.put(MethodPointer.METHOD, medium);
        for (TypePointerClassification typeClassification : TypePointerClassification.values()) {

            conceptWeightMap.put(typeClassification.toString(), high);
        }
        conceptWeightMap.put(XmlElementDeclPointer.XML_ELEMENT, low);
        conceptWeightMap.put(FilePointer.FILE, high);


    }

    public static float getConceptWeight(String concept)
    {
        return conceptWeightMap.get(concept);
    }

    public static List<ConceptTypeSimilarity> getSimilaritiesFor(String conceptName) {
        return similarityMap.get(conceptName);
    }

    public static void printAllSimilarities() {
        for (Map.Entry<String, List<ConceptTypeSimilarity>> entry : similarityMap.entrySet()) {
            System.out.println(entry.getKey());
            for (ConceptTypeSimilarity conceptTypeSimilarity : entry.getValue()) {
                System.out.println("       "+conceptTypeSimilarity.getSecondConceptType()+":"+conceptTypeSimilarity.getSimilarity());

            }
            System.out.println();


        }

    }
}
