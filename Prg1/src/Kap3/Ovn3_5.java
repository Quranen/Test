package Kap3;

import javax.swing.*;

class Ovn3_5 {
    public static void main (String [] args) {
        String s1, s2;
        int t1 ,t2;
        
        s1 = JOptionPane.showInputDialog("Vad kostar varan (med moms)?");
        
        t1 = Integer.parseInt(s1);
        
      
        
        JOptionPane.showMessageDialog(null,"Varan kostade utan moms: " + (t1 - (t1 * 0.25)) + "\nMomsen är då: " +  (t1 * 0.25));

                
        
        
        
    }
}