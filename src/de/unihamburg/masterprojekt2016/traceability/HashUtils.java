package de.unihamburg.masterprojekt2016.traceability;

/**
 * @author Nils-Hendrik Berger
 *
 */

public final class HashUtils
{
    public static final int PRIME = 31;

    private HashUtils()
    {
    }

    public static final int calcHashCode(final int hash, final boolean input)
    {
        return PRIME * hash + (input ? 1 : 0);
    }

    public static final int calcHashCode(final int hash, final int input)
    {
        return PRIME * hash + input;
    }

    public static final int calcHashCode(final int hash, final long input)
    {
        return PRIME * hash + (int) (input ^ (input >>> 32));
    }

    public static final int calcHashCode(final int hash, final float input)
    {
        return calcHashCode(hash, Float.floatToIntBits(input));
    }

    public static final int calcHashCode(final int hash, final double input)
    {
        return calcHashCode(hash, Double.doubleToLongBits(input));
    }

    public static final int calcHashCode(final int hash, final Object input)
    {
        return (input == null) ? 0 : PRIME * hash + input.hashCode();
    }
}