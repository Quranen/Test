package Kap3;

import javax.swing.*;


class Ovn3_3 {
    public static void main (String [] args) {
        String s1;
        Double d1;
        
        s1 = JOptionPane.showInputDialog("Skriv in en cirkels radie i cm:");
        
        d1 = Double.parseDouble(s1);
        
        JOptionPane.showMessageDialog(null, "Cirkelns omkrets: " +Double.toString( 2 * Math.PI * d1) + " cm" + "\nCirkelns area: " + Double.toString(Math.PI * Math.pow(d1, 2)) + " cm^2");
    }
}