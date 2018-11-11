package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.swk.traceabilityrecovery.Language;
import org.junit.Test;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class TermFactorOptimizerTest {



    @Test
    public void TestOptimization() {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        new TermFactorOptimizer().optimizeTermFactors("../testDocs/MDW", "../testDocs/MDW/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }
}
