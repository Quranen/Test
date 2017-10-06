package Kap3;

import javax.swing.*;

class Ovn3_9_5 {
    public static void main (String [] args) {
        
        String s1;
        double d1, d2, d3;
        
        s1 = JOptionPane.showInputDialog("Ange år:");
        
        d1 = Double.parseDouble(s1);
        d2 = Math.log(2) / 5730;
        d3 = 1 * Math.exp(-d2 * d1);
        
        JOptionPane.showMessageDialog(null,"Efter " + s1 + " år så återstår: " + d3 * 100 + " % av Kol-isotopen");
    }
}