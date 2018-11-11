package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */
public class TraceLinkRecoveryOptimizationData {

    private String _pathToGroundTruth;
    private String _sourcePath;
    private Language targetLanguage;

    public TraceLinkRecoveryOptimizationData(String pathToGroundTruth, String sourcePath, Language targetLanguage) {
        this._pathToGroundTruth = pathToGroundTruth;
        this.targetLanguage = targetLanguage;
        _sourcePath = sourcePath;
    }

    public String getPathToGroundTruth() {
        return _pathToGroundTruth;
    }

    





    public Language getTargetLanguage() {
        return targetLanguage;
    }

    public String getSourcePath() {
        return _sourcePath;
    }
}
