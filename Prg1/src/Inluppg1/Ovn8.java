package Inluppg1;

import javax.swing.*;

class Ovn8 {
    public static void main (String [] args) {
        
        String s1;
        
        s1 = JOptionPane.showInputDialog("Skriv tre tecken");
        
        JOptionPane.showMessageDialog(null,"I omvänd ordning blir dina tecken: " + s1.charAt(2) + s1.charAt(1) + s1.charAt(0));
        
    }
}