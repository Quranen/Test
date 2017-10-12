package Inluppg1;

import javax.swing.*;

class Ovn9 {
    public static void main (String [] args) {
        
        String s1, s2;
        
        s1 = JOptionPane.showInputDialog("Skriv en gemen");
        
        s1 = s1.toUpperCase();
        
        s2 = JOptionPane.showInputDialog("Skriv en versal");
        
        s2 = s1.toLowerCase();
        
        JOptionPane.showMessageDialog(null,"Din gemen blir: " + s1 + "\nDin versal blir: " + s2);
    }
}