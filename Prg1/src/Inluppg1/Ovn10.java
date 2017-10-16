package Inluppg1;

import javax.swing.*;

class Ovn10 {
    public static void main (String [] args) {
        
        String s1, s2;
        int t1;
        char c1;
        s2 = "";
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
       
        
        for (int t=0; t < s1.length(); t++) {
            t1 = (int)(c1 = s1.charAt(t));
            if (t1 >= 90 && t1 < 97) {
                s2 = s2 + Character.toString((char)(t1 - 25));
            } else if (t1 < 122) {
                s2 = s2 + Character.toString((char)(t1 + 1));
            } else {
                s2 = s2 + Character.toString((char)(t1 - 25));
            }
    }
        JOptionPane.showMessageDialog(null, "Valt ord: " + s1 + "\nResultat: " + s2);

    }
}
