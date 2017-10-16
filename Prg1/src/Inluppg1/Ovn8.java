package Inluppg1;

import javax.swing.*;

class Ovn8 {
    public static void main (String [] args) {
        
        String s1, s2;
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
        s2 = "";
        
        for (int t = s1.length() - 1; t >= 0; t--) {
            s2 = s2 + s1.charAt(t);
        }
        
        JOptionPane.showMessageDialog(null,"I omvänd ordning blir ordet: " + s2);
        
    }
}