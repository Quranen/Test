package Kap3;

import javax.swing.*;

class Ovn3_9_4 {
    public static void main (String [] args) {
        
        String s1, s2, s3, s4;
        double d1, d2, d3 ,d4, d5;
        
        s1 = JOptionPane.showInputDialog("Skriv x1");
        s2 = JOptionPane.showInputDialog("Skriv y1");
        s3 = JOptionPane.showInputDialog("Skriv x2");
        s4 = JOptionPane.showInputDialog("Skriv y2");
        
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        d3 = Double.parseDouble(s3);
        d4 = Double.parseDouble(s4);
        d5 = Math.sqrt(Math.pow(d1 - d2, 2) + Math.pow(d3 - d4, 2));
        
        JOptionPane.showMessageDialog(null, "Avståndet mellan x1,y1 och x2,y2 är: " + d5);
        
    }
}