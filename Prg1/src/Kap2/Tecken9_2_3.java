package Kap2;

import javax.swing.*;

class Tecken9_2_3 {
    public static void main (String [] args) {
        
        String a , b;
        int i, l, h;
        
        a = JOptionPane.showInputDialog("Skriv en mening med minst två ord");
        
        i = a.length();
        l = a.lastIndexOf(" ") + 1;
        h = a.indexOf(" ");
        
        JOptionPane.showMessageDialog(null,"Du skrev en mening med " + i + " tecken!"
                + "\nDet första ordet var: " + a.substring(0, h) + 
                 "\nDet sista ordet var: " + a.substring(l));
        

        
        
    }
}