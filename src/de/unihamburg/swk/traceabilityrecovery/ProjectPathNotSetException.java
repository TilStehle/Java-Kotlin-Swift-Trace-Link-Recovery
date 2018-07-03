package de.unihamburg.swk.traceabilityrecovery;

public class ProjectPathNotSetException extends RuntimeException {
    public ProjectPathNotSetException()
    {
        super("The project Path is not set!");
    }
}
