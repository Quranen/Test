package Inluppg1;

import javax.swing.*;

class Black1 {
    public static void main (String [] args) {
        
        int t1, t2;
        
        t1 = JOptionPane.showConfirmDialog(null,"Vill du spela blackjack?");
        
        if (t1 == JOptionPane.YES_OPTION) {
            
            int kort1, kort2, hus1, hus2, kv1, kv2;
            
            kort1 = (int)(Math.random() * 13 + 1);
            kort2 = (int)(Math.random() * 13 + 1);
            kv1 = kort1 + kort2;
            
            hus1 = (int)(Math.random() * 13 + 1);
            hus2 = (int)(Math.random() * 13 + 1);
            kv2 = hus1 + hus2;
            
            JOptionPane.showMessageDialog(null,"Ditt första kort är: " + kort1
            + "\nDitt andra kort är: " + kort2
            + "\nDitt total kortvärde är: " + kv1
            + "\nHusets första kort är: " + hus1);
                  
        }
        
    }
}