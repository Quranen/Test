package Kap2;

import javax.swing.*;

class Ovn2_4 {
    public static void main (String [] args) {
        
        String s1, s2, s3;
       
        
        s1 = JOptionPane.showInputDialog("Vad heter du i förnamn?"); //Dialogruta som ber om förnamn
        s2 = JOptionPane.showInputDialog ("Vad heter du i efternamn?"); //Dialogruta som ber om efternamn
        s3 = "Välkommen " + s1 + " " + s2;  
      
        
        JOptionPane.showMessageDialog(null, s3);
        
    }
}