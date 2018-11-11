package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

import static javax.xml.bind.JAXBContext.*;

/**
 * Created by Tilmann Stehle on 07.02.2017.
 */
public class XMLImport {
    private static JAXBContext jaxbContext;
    private static Unmarshaller jaxbUnmarshaller;
    static
    {
        try {
            jaxbContext = newInstance(TraceabilityModel.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a String containing the  XML representation of  a given Traceability Pointer
     */

    public static synchronized TraceabilityPointer unmarshalPointer(String pointerAsXML) {


        try {
            StringReader stringReader = new StringReader(pointerAsXML);
            TraceabilityPointer pointer = (TraceabilityPointer) jaxbUnmarshaller.unmarshal(stringReader);
            return pointer;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }

}
