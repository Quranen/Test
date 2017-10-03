package Kap2;

import javax.swing.*;

class Kul {
    public static void main (String [] args) {
     
     char tecken;
     String s;
     
     s = JOptionPane.showInputDialog("Mata in ett tecken");
     tecken = s.charAt(0); // ta ut 1:a tecknet ut String och omvandla det till ett char tecken
     
     JOptionPane.showMessageDialog (null, "Det inmatade teckenet är "
             + "\nefter omvandling till Ascii koden: " + (int)tecken);
     
        
    }    
}