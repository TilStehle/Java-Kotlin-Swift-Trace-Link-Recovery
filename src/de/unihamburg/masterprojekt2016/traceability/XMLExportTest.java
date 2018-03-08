package de.unihamburg.masterprojekt2016.traceability;

import java.io.File;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLExportTest {

	public static void main(String[] args) {

		// JAVA (Quelle)
		TypePointer javaClassPointer = new TypePointer("javaClass", 0);
		MethodPointer javaMethodPointer = new MethodPointer("JavaMethod", 23);
		javaMethodPointer.setTypePointer(javaClassPointer);
		javaMethodPointer.setReturnType("int");
		javaMethodPointer.addParameter(new Parameter("age", "int"));

		// SWIFT (Senke)
		TypePointer swiftClassPointer = new TypePointer("swiftClass", 0);
		ConstructorPointer swiftMethodPointer = new ConstructorPointer("SwiftMethod", 23);
		swiftMethodPointer.setTypePointer(swiftClassPointer);
		//swiftMethodPointer.setReturnType("Int");
		swiftMethodPointer.addParameter(new Parameter("age", "Int"));

		TraceabilityModel javaClassModel = new TraceabilityModel(javaClassPointer);
		javaClassModel.addTraceabilityLink(new TraceabilityLink(javaMethodPointer, swiftMethodPointer));

		TraceabilityModel rootModel = new TraceabilityModel();
		rootModel.addSubModel(javaClassModel);
		rootModel.addTraceabilityLink(new TraceabilityLink(javaClassPointer, swiftClassPointer));
		
		Set<TraceabilityLink> sss = rootModel.getTraceabilityLinkForPointer(javaMethodPointer);
		System.out.println("methodLink:\n" + sss);
		
		try {
			File file = new File("TraceabilityModel.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(rootModel, file);
			// jaxbMarshaller.marshal(model, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
