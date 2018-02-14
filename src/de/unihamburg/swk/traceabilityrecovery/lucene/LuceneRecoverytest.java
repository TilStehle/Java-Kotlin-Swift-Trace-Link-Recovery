package de.unihamburg.swk.traceabilityrecovery.lucene;

import java.io.IOException;

/**
 * Created by Tilmann Stehle on 14.07.2017.
 */
public class LuceneRecoverytest {
    public static void main(String[]args)
    {
        try {
            LuceneTraceabilityRecoveryService luceneTraceabilityRecoveryService = new LuceneTraceabilityRecoveryService();
            luceneTraceabilityRecoveryService.setIndexPath("C:\\Users\\Tilmann Stehle\\Documents\\Tests\\index");
            luceneTraceabilityRecoveryService.discardIndexAndReadDocuments("C:\\Users\\Tilmann Stehle\\Documents\\Tests");
            luceneTraceabilityRecoveryService.printDocuments();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
