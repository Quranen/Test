

package Kap2;

import javax.swing.*;

class FemteINionde {
    public static void main (String [] args){
        
        //Genomgång, vad är en variabel? Kap2, se boken
        
        String s1, s2;
        
        s1 = "Hej";
        s2 = "på dig";
        
        
        /* En variabel kan jämföras med att placera olika saker i en byrå,
         * kan vara ett värde av typ bokstäver, siffror och tecken
         *Dock måste en variabel kopplas till en datatyp, i detta fellet string
         * String och ett namn, s1 och s2
         * Tecken betyder inom programmering tilldelas
         * så s1 tilldelas värdet med textinnehåll "Hej"
         * och s2 tilldelas ett värde med textinnehåll "på dig"
        */
        s2 = s1; //Betyder att s2 får innehållet av s1
        System.out.println(s2);
        System.out.println(s1);
        s1 = s2 + " hem" + " Tony";
        System.out.println(s1);
        
        // Kort sammanfatta vad är en variabeldeklaration?
        //1. Välj en datatyp, ex string
        //2. Varje datatyp måste ha ett namn, ex s1
        //3. Varje datatyp måste tilldelas värde eller funktion
        
        s2 = s2 + " " + System.getProperty("user.name");
        System.out.println(s2);
         
 
    } 
    
    
}
