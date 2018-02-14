package de.unihamburg.swk.traceabilityrecovery.commands;

import java.io.IOException;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public interface ITraceabilityRecoveryCommand {
    void execute() throws IOException;
}
