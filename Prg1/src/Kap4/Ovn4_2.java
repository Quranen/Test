package Kap4;

import javax.swing.*;

class Ovn4_2 {
    public static void main (String [] args) {
        
        JOptionPane.showMessageDialog(null,"Ett årskort kostar: " + 300 * 12 + "kr" + "\nEtt dagsinträde kostar 100kr");
        
        String s1;
        double d1;
        
        s1 = JOptionPane.showInputDialog("Hur många gånger tänker du besöka gymmet i år?");
        
        d1 = Double.parseDouble(s1) * 100;
        
        if (d1 >= 3600)
            JOptionPane.showMessageDialog(null,"Du borde köpa ett årskort, det är mest värt det");
        else
            JOptionPane.showMessageDialog(null,"Du borde bara köpa dagsinträden, det lönar sig i längden");
    }
}