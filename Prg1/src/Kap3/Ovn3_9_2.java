package Kap3;

import javax.swing.*;

class Ovn3_9_2 {
    public static void main (String [] args) {
        
        String s1;
        double d1, d2;
        
        s1 = JOptionPane.showInputDialog("Skriv en temperatur i Farenheit");
        
        d1 = (Double.parseDouble(s1) - 32) * 5 / 9;
        
        JOptionPane.showMessageDialog(null, d1);
        
    }
}