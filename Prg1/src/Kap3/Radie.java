package Kap3;

import javax.swing.*;

class Radie {
    public static void main (String [] args) {
        
        String s1, s2; 
        int t1, t2, t3;
        double d1;
        
        s1 = JOptionPane.showInputDialog("Skriv en cirkels radie i cm");
        d1 = Double.parseDouble(s1);
        
        t1 = (int) 3.1415926536;
        t2 = (int) Math.pow(d1, 2) * t1;
        t3 = (int) ((int) 2 * t1 * d1);
        
        JOptionPane.showMessageDialog(null,"Cirkelns radie \u2248 " + t2 + "\n" + "Cirkelns omkrets \u2248" + t3);
        
        
        
        
    }
}