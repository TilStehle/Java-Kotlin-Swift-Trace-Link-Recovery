package de.unihamburg.swk.parsing;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Created by Tilmann Stehle on 05.07.2017.
 */
public class InterruptableErrorHandler extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        if (!Thread.currentThread().isInterrupted()) {
            super.recover(recognizer, e);
        } else {
            throw new ParsingTimeOutException();
        }
    }

    @Override
    protected void beginErrorCondition(Parser recognizer) {
        if (!Thread.currentThread().isInterrupted()) {
            super.beginErrorCondition(recognizer);
        } else {
            throw new ParsingTimeOutException();
        }
    }

    @Override
    protected void endErrorCondition(Parser recognizer) {
        if (!Thread.currentThread().isInterrupted()) {
            super.endErrorCondition(recognizer);
        } else {
            throw new ParsingTimeOutException();
        }
    }
}
