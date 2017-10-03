/*
 * Initiering betyder att man tilldelar variabler med ett värde
 * Det är inte att önskvärt att bland ihop olika variabler eller datatyper
 * men ibland måste man det för att ge olika värden till en annan funktion
 */


package Kap2;

import javax.swing.*;

class Ovn2_1_3 {
    public static void main (String [] args) {
        
        String s1;
        
        s1 = "välkommen";
        int i1, i2; //Int betyder heltalshantering
        i1 = 5;
        i2 = 4;
       
        System.out.println(s1 + i1 + i2);
        System.out.println(i1 + i2);
        System.out.println(i1 + i2 + s1);
        System.out.println(" " + i1 + i2); //Gissar 54
        System.out.println(s1 + (i1 + i2));        
    }
}