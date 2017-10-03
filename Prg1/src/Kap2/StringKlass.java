package Kap2;
/*
 * Mer om standardklassen String
 * Stringklass är en extra funktion till datatypen String
 * och med hjälp av dessa kombinationer med if-sats/forsats
 * kan man ge programmet et helt annat utseende
 * Den gula rutan i boken är mycket viktig att förstå
 */
import javax.swing.*;

class StringKlass {
    public static void main (String [] args) {
        
        String a, b;    //Steg 1 och 2
        int i;
        
        a = "programspråk"; //steg 3
        i = a.length ();    
        
        System.out.println(i);  //Kombination av int och String
        b = "var" + a.charAt(3); //Man räknar från noll, dvs a.charAt (3) ger "g"
        
        b = a.substring(7);     //Börjar på position sju och forstätter tills order är slut
        System.out.println(b);
        
        b = a.substring(3, 7); //Börjar på position tre och slutar på sju. Ger gram
        System.out.println(b);
        
        i = a.indexOf("språk");     //a.indexOf ger vilken position en bokstav eller flera börjar i en String.
        System.out.println(i); // -1 betyder att värde saknas
        

        

    }
}