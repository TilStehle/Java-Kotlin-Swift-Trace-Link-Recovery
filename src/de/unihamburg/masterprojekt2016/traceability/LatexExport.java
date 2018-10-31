package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tilmann Stehle on 28.11.2017.
 */
public class LatexExport {
    public static void main(String[] args)
    {
        try {
            exportLatex(importTraceabilityModelFromXML("./testDocs/MDW/groundTruth/TraceabilityModel.xml"), "C:\\Users\\Tilmann Stehle\\Documents\\Diss\\Veroeffentlichungen\\Journal of Software - Evoluation and Process\\HafenDesWissensLinks.tex");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static TraceabilityModel importTraceabilityModelFromXML(String linkModelXMLPath) {
        TraceabilityModel groundTruthModel = null;
        try {
            File file = new File(linkModelXMLPath);
            JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            groundTruthModel = (TraceabilityModel) jaxbUnmarshaller.unmarshal(file);
            for (TraceabilityLink link : groundTruthModel.getTraceabilityLinkList()) {
                link.getTarget().setSourceFilePath(link.getTarget().getSourceFilePath());
                link.getSource().setSourceFilePath(link.getSource().getSourceFilePath());
            }

            return groundTruthModel;


        } catch (JAXBException e) {
            throw new RuntimeException("Make sure to provide an XML File \"TraceabilityModel.xml\" providing the correct traceability links that your search shall be evaluated against!", e);
        }
    }

    private static final String HEADER = "\n" +
            "\\documentclass[]{scrartcl}\n" +
            "\\begin{document}\n" +
            "\\begin{table*}\n" +
            "\\tiny\n" +
            "  \\centering\n" +
            "  \\caption{Table of  Manually Created Trace Links from the Android Implementation of Twidere to the corresponding iOS Implementation}\n" +
            "  \\label{groundTruth_links}\n" +
            "  \\begin{tabular}{|l|r|}\n" +
            "    \\hline\n" +
            "    Source type (Java or Kotlin) & Target type (Swift)\\\\\n" +
            "    \\hline";
    private static final String FOOTER = "  \\end{tabular}\n" +
            "\\end{table*}\n" +
            "\n" +
            "\\end{document}";

    public static void exportLatex(TraceabilityModel model, String filePath) throws FileNotFoundException {

        StringBuilder latexString=new StringBuilder(HEADER);
        List<TraceabilityLink> allLinks = model.getTraceabilityLinkListRecursivelyIncludingSubmodelLinks();
        allLinks.sort(new Comparator<TraceabilityLink>() {
            @Override
            public int compare(TraceabilityLink o1, TraceabilityLink o2) {
                return getMostSpecificName(o1.getSource()).compareTo(getMostSpecificName(o2.getSource()));
            }
        });
        for (TraceabilityLink link : allLinks) {
            createTableLine(latexString,getMostSpecificName(link.getSource()), getMostSpecificName(link.getTarget()));
        }
        latexString.append('\n');
        latexString.append(FOOTER);

        File file = new File(filePath);
        try(  PrintWriter out = new PrintWriter( filePath )  ){
            out.println( latexString );
        }
    }

    private static void createTableLine(StringBuilder latexString, String firstColumn, String secondColumn) {
        latexString.append('\n');
        latexString.append(firstColumn);
        latexString.append(" & ");
        latexString.append(secondColumn);
        latexString.append("\\\\");
        latexString.append('\n');
        latexString.append("\\hline");
    }

    private static String getMostSpecificName(TraceabilityPointer pointer)
    {
        String result= "";
        if(pointer instanceof FullyQuallyfying)
        {
            result=((FullyQuallyfying)pointer).getFullyQualifiedName();
        }
        else
        {
            result= pointer.getDisplayName();
        }
        return result;
    }
}
