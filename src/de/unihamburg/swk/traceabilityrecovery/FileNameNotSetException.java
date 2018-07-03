package de.unihamburg.swk.traceabilityrecovery;

/**
 * Created by Tilmann Stehle on 10.03.2017.
 */
public class FileNameNotSetException extends RuntimeException {
    public FileNameNotSetException()
    {
        super("The FileName is not set!");
    }
}
