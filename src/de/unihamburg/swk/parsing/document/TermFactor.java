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

    @Override
    public String toString() {
        return ""+_factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermFactor that = (TermFactor) o;

        if (_factor != that._factor) return false;
        return _factorIdentifier != null ? _factorIdentifier.equals(that._factorIdentifier) : that._factorIdentifier == null;
    }

    @Override
    public int hashCode() {
        int result = _factor;
        result = 31 * result + (_factorIdentifier != null ? _factorIdentifier.hashCode() : 0);
        return result;
    }
}
