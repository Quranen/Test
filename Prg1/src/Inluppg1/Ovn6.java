package Inluppg1;

import javax.swing.*;

class Ovn6 {
    public static void main (String [] args) {
        
        String s1, s2, s3;
        double d1, d2, d3, d4, d5, d6;
        
        s1 = JOptionPane.showInputDialog("Skriv ett antal timmar");
        s2 = JOptionPane.showInputDialog("Skriv ett antal minuter");
        s3 = JOptionPane.showInputDialog("Skriv ett antal sekunder");
        
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        d3 = Double.parseDouble(s3);
        
        d4 = d1 * 3600;
        d5 = d2 * 60;
        d6 = d3 + d4 + d5;
        
        JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + " timmar, " + d2 + "minuter, " + d3 + "sekunder, vilket blir: " + d6 + "sekunder");
        
        
    }
}