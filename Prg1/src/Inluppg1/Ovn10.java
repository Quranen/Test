package Inluppg1;

import javax.swing.*;

class Ovn10 {
    public static void main (String [] args) {
        
        String s1, s2;
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
        s2 = JOptionPane.showInputDialog("Hur många steg vill du förskjuta");
        
        
        
        
        JOptionPane.showMessageDialog(null,"Det inskrivna ordet var: " + s1 + "Och du förskjöt med: " + s2 + "steg");
        
        
    }
}