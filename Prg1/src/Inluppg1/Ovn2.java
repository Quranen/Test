package Inluppg1;

import javax.swing.*;

class Ovn2 {
    public static void main (String [] args) {
        
        String s1, s2;
        double t1, t2;
        
        s1 = JOptionPane.showInputDialog("Skriv ett heltal");
        s2 = JOptionPane.showInputDialog("Skriv ett heltal");
        
        t1 = Double.parseDouble(s1);
        t2 = Double.parseDouble(s2);
        
        t1=t2=2.0;
        t1++;
        
        JOptionPane.showMessageDialog(null, t1 + " * " + t2 + " är: " + t1 * t2);
        
    }
}