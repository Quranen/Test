package Kap2;

import javax.swing.*;
import java.util.*;

class Datum2_9_1 {
    public static void main (String [] args) {
        
        String a;
        
        a = Calendar.getInstance().getTime().toString();
        a = a.substring(11, 19);
       JOptionPane.showMessageDialog(null,"Klockan är: " + a);
        
    }
}