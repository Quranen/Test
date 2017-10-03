package Kap2;

import javax.swing.*;

class Char {
    public static void main (String [] args) {
        /* Char är en datatyp, syskon till String. 
         * Skillnaden är att Char kan hantera ett tecken åt gången.
         * Varför behöver man char?
         * För att hantera t.ex. lösenord i ett säkert system,
         * samt vid programmering av spel.
         */
        char tecken;
        tecken = 'a'; //Hanterar endast ett tecken åt gången. Hanterar siffror, bokstäver och tecken
        System.out.println(tecken); // a
        
        char tecken2;
        tecken2 = 'b';
        
        System.out.println(tecken + tecken2); //198, pga ASCII kod (AsciiTable.com)
        System.out.println(tecken + "" + tecken2); //Addering av String ger oss ab
        
        char c; // '\u2663' kommer från unicode.org
        c = '\u2663';
        System.out.println(c);
        
        String s = " " + tecken + tecken;
        int t;
        t = 2;
        // Kolla svaret
        System.out.println(tecken + s); // a aa
        System.out.println(s + tecken); // (mellanrum)aaa
        System.out.println(s + t + tecken); // aa2a
        System.out.println(t + s + tecken); // 2 aaa
        
        double dec = 5.1;    //Hanterar decimaler
        System.out.println(dec + t + s + tecken); //7.1 aaa
        System.out.println(tecken + dec + s + t); //102.1 aa2
    }
}