package Kap1;

import java.awt.Toolkit;
import javax.swing.*;

class Ovn1 {
    public static void main (String [] args){
        Toolkit.getDefaultToolkit ().beep();
       JOptionPane.showMessageDialog(null,"Java är enkelt att lära sig");
       JOptionPane.showMessageDialog(null, "Hej"
               + System.getProperty("user.name") + ("!"));
       
       
       // J står för Java 
       // O står för ordet val
       // P står för ordet panel
       //. betyder att vi har avslutat ett anrop, i detta fallet funktionen
       //null, void betyder att man returnernar till sig själv, datatyp String
    }
}