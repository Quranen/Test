package Kap3;

import javax.swing.*;

class Ovn3_8 {
    public static void main (String [] args) {
        String s1, s2;
        double d1, d2;
        
        s1 = JOptionPane.showInputDialog("Temperatur Malmö");
        s2 = JOptionPane.showInputDialog("Temperatur Kristianstad");
        
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        
        if (d2 >= d1) {
           JOptionPane.showMessageDialog(null,"Kristianstad hade den högsta temperaturen: " + Math.max(d1, d2)); 
        } else JOptionPane.showMessageDialog(null,"Malmö hade den hösta temperaturen: " + Math.max(d1, d2));
        
        
    }
}