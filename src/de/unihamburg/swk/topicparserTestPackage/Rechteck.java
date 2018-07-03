package de.unihamburg.swk.topicparserTestPackage;


class Rechteck extends Figur
{
  private double a, b;

  public Rechteck( double a, double b )
  {
    this.a = a;
    this.b = b;
  }

  public double getFlaeche()
  {
    return a * b;
  }
}