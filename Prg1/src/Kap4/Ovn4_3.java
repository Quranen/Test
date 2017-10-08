package Kap4;

import javax.swing.*;

class Ovn4_3 {
    public static void main (String [] args) {
        
        String s1;
        double d1;
        
        s1 = JOptionPane.showInputDialog("Hur många poäng fick du?");
        
        d1 = Double.parseDouble(s1);
        
        if (d1 >= 25)
            JOptionPane.showMessageDialog(null,"Ditt betyg är E");
        else if (d1 >= 30)
            JOptionPane.showMessageDialog(null,"Ditt betyg är D");
        else if (d1 >= 35)
            JOptionPane.showMessageDialog(null,"Ditt betyg är C");
        else if (d1 >= 40)
            JOptionPane.showMessageDialog(null,"Ditt betyg är B");
        else if (d1 >= 45)
            JOptionPane.showMessageDialog(null,"Ditt betyg är A");
              
    }
}