package de.unihamburg.swk.traceabilityrecovery;

/**
 * Created by Tilmann Stehle on 10.03.2017.
 */
public class IndexPathNotSetException extends RuntimeException {
    public IndexPathNotSetException()
    {
        super("The index Path is not set!");
    }
}
