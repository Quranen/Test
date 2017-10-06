package Kap3;

import javax.swing.*;

class Ovn3_9_3 {
    public static void main (String [] args) {
        
        double d1, d2;
        
        d1 = 2 / 1.609;     //Fixa sätt att avrunda talen
        d2 = 2 / 3.785;
        
        JOptionPane.showMessageDialog(null,  d1 + " / " + (int) d2);
    }
}