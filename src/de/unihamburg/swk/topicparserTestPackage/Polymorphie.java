package de.unihamburg.swk.topicparserTestPackage;

import java.util.Vector;

public class Polymorphie
{
  public static void main( String[] args )
  {
    double   flaeche = 0;
    // Instanziiere Figur-Objekte:
    Rechteck re1 = new Rechteck( 3, 4 );
    Figur    re2 = new Rechteck( 5, 6 );
    Kreis    kr1 = new Kreis( 7 );
    Figur    kr2 = new Kreis( 8 );
    Vector   vec = new Vector();
    // Fuege beliebig viele beliebige Figuren hinzu:
    vec.add( re1 );
    vec.add( re2 );
    vec.add( kr1 );
    vec.add( kr2 );
    // Berechne die Summe der Flaechen aller Figuren:
    for( int i=0; i<vec.size(); i++ ) {
      Figur f = (Figur)(vec.get( i ));
      flaeche += f.getFlaeche();
    }
    System.out.println( "Gesamtflaeche ist: " + flaeche );
  }
}