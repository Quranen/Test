package Kap3;

import javax.swing.*;

class Ovn3_9_1 {
    public static void main (String [] args) {
        
        String s1;
        Double d1, d2, d3;
        
        s1 = JOptionPane.showInputDialog("Skriv en sfärs radie");
        
        d1 = Double.parseDouble(s1);
        
        d2 = (4 * Math.PI * Math.pow(d1, 3)/3);
        d3 = 4 * Math.PI * Math.pow(d1, 2);
        
        JOptionPane.showMessageDialog(null,"Sfärens volym: " + d2 + " cm^3" + "\nSfärens area: " + d3 + " cm^2");
        
    }
}