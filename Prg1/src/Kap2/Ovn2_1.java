/* Vi ska skapa ett program som består av fyra string variabler och med
 * tre olika tilldelningar. Den fjärde variabeln ska innehålla all text som
 * vi hämtar från tilldelningar. Använd av stringfunktion \n betyder radmantning
 */




package Kap2; 

import javax.swing.*;

class Ovn2_1 {
    public static void main (String [] args) {
        
        String namn, adress, telenr, allt;
        
        
        
        namn = "Jacob Wattwil";
        adress = "Tegelslagrev.3";
        telenr = "0709630609";
        allt = namn + "\n" + adress + "\n" + telenr;
        
        
 
        JOptionPane.showMessageDialog (null, allt);
        
        
        
        
    }
}