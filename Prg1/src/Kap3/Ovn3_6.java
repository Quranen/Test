package Kap3;

import javax.swing.*;

class Ovn3_6 {
    public static void main (String [] args) {
        
        String s1;
        int tid, tim, min, sek;
        
        s1 = JOptionPane.showInputDialog("Hur många sekunder?");
        
       
        
       tid = Integer.parseInt(s1);
       sek = tid;
       min = sek / 60;
       tim = min / 60;
       
       if (sek >= 60) {
           min = sek/60;
       }
       if (min >= 60) {
           tim = min/60;
       }
        System.out.println();
        
        
        
    }
}