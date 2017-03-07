package de.unihamburg.masterprojekt2016.traceability;

/**
 * Created by Tilmann Stehle on 22.02.2017.
 */
public class ConceptTypeSimilarity {

    private String firstConceptType;
    private String secondConceptType;

    public String getFirstConceptType() {
        return firstConceptType;
    }

    public String getSecondConceptType() {
        return secondConceptType;
    }

    public float getSimilarity() {
        return similarity;
    }

    private float similarity;

    public ConceptTypeSimilarity(String firstConceptType, String secondConceptType, float similarity) {
        this.firstConceptType = firstConceptType;
        this.secondConceptType = secondConceptType;
        this.similarity = similarity;
    }
}
