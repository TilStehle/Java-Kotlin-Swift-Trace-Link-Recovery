package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Tilmann Stehle on 07.02.2017.
 */
public class XMLImport {
    /**
     * Creates a String containing the  XML representation of  a given Traceability Pointer
     */

    public static TraceabilityPointer unmarshalPointer(String pointerAsXML) {

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);
            StringReader stringReader = new StringReader(pointerAsXML);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            TraceabilityPointer pointer = (TraceabilityPointer) jaxbUnmarshaller.unmarshal(stringReader);
            return pointer;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }

}
