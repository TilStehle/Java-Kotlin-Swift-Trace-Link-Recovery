package de.unihamburg.masterprojekt2016.traceability;

public final class EqualsUtils
{
    private EqualsUtils()
    {
    }

    public static boolean nullSafeEquals(final Object obj1, final Object obj2)
    {
        return (obj1 == obj2) || (obj1 != null && obj1.equals(obj2));
    }
}