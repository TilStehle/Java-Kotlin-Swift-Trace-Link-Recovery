package de.unihamburg.swk.parsing.document;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class TermFactor {

    private final int _factor;
    private final String _factorIdentifier;

    public TermFactor(int _factor, String _factorIdentifier) {
        this._factor = _factor;
        this._factorIdentifier = _factorIdentifier;
    }

    public int getFactor() {
        return _factor;
    }

    public String getFactorIdentifier() {
        return _factorIdentifier;
    }
}
