package Kap3;

import javax.swing.*;

class Ovn3_4 {
    public static void main (String [] args) {
        
        String s1, s2;
        Double d1, d2;
        
        s1 = JOptionPane.showInputDialog("Genomsnittligt antal minuter per månad");
        s2 = JOptionPane.showInputDialog("Pris per minut");
        
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        
        JOptionPane.showMessageDialog(null,"Beräknad kostnad per månad: " + d1 * d2);
        
    }
}