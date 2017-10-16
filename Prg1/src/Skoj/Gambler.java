package skoj;

import javax.swing.*;

class Gambler {
    public static void main (String [] args) {
        
        String s1, s2;
        double d1, d2;
        int t1;
        
        s1 = JOptionPane.showInputDialog("Hur mycket vill du satsa?");
        d1 = Double.parseDouble(s1);
        d2 = Math.random();
        System.out.println(d2);
        

        if (d2 > 0.5) {
            t1 = JOptionPane.showConfirmDialog(null, "Grattis, du vann: " + d1 * 2 + "tryck Ja för att testa igen");
        } else JOptionPane.showMessageDialog(null, "Du vann inte, testa igen!");
            
        
        
    }
}