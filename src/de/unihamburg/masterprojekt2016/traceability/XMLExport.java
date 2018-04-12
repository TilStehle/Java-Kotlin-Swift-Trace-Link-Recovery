package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;

/**
 * Created by Evelyn Fischer on 03.11.2016.
 */
public class XMLExport {

    private static JAXBContext jaxbContext;

    private static Marshaller marshaller;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(TraceabilityPointer.class);
            marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a XML File for a given Traceability Model
     *
     * @param traceabilityModel Model the XML file is created for
     * @param exportPath        Path to where the XML file will be saved
     */

    public static void createXMLFile(TraceabilityModel traceabilityModel, String exportPath) {

        try {

            File file = new File(exportPath + File.separator + "TraceabilityModel.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(traceabilityModel, file);
            jaxbMarshaller.marshal(traceabilityModel, System.out); // For debugging purposes only

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a String containing the  XML representation of  a given Traceability Pointer
     */

    public static String createXMLStringFromPointer(TraceabilityPointer pointer) {

        try {
            StringWriter sw = new StringWriter();
            marshaller.marshal(pointer, sw);
            return sw.toString();

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static String createStringFromLink(TraceabilityLink link) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityLink.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            StringWriter sw = new StringWriter();
            marshaller.marshal(link, sw);
            return sw.toString();

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
