package de.unihamburg.masterprojekt2016.traceability;

import java.io.File;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLImportTest {
	public static void main(String[] args) {

		try {

			File file = new File("TraceabilityModel.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			TraceabilityModel rootModel = (TraceabilityModel) jaxbUnmarshaller.unmarshal(file);
			
			TypePointer javaClassPointer = new TypePointer("javaClass", 0);
			MethodPointer javaMethodPointer = new MethodPointer("JavaMethod", 23);
			javaMethodPointer.setTypePointer(javaClassPointer);
			javaMethodPointer.setReturnType("int");
			javaMethodPointer.addParameter(new Parameter("age", "int"));
			
			Set<TraceabilityLink> sss = rootModel.getTraceabilityLinkForPointer(javaMethodPointer);
			System.out.println("methodLink:\n" + sss);
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
