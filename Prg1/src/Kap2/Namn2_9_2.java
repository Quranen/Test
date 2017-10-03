package Kap2;

import javax.swing.*;

class Namn2_9_2 {
    public static void main (String [] args) {
        String a;
        int i;
        
        a = JOptionPane.showInputDialog("Vad är ditt nam? Efter- sen förnamn");
        i = a.lastIndexOf(" ") + 1;
    
        JOptionPane.showMessageDialog(null,"Välkommen " + a.substring(i));
    
    
    }
}