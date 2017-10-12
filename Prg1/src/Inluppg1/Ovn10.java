package Inluppg1;

import javax.swing.*;

class Ovn10 {
    public static void main (String [] args) {
        
        String s1, s2;
        int c1, c2;
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
        s2 = JOptionPane.showInputDialog("Hur många steg vill du förskjuta");
        
       c1 = s1.charAt(0);
       c2 = s2.charAt(0);
       c2 = c1++ * c2;
       if (c1 == 'z') c1 = 'a';
       
        
        
        
        JOptionPane.showMessageDialog(null,"Det inskrivna ordet var: " + c1 + "Och du förskjöt med: " + s2 + "steg");
        
        
    }
}