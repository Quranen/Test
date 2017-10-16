package Inluppg1;

import javax.swing.*;

class Ovn11 {
    public static void main (String [] args) {
        
        String s1, s2, s3;
        int t1, t2;
        char c1;
        s2 = "";
        
        
        s1 = JOptionPane.showInputDialog("Skriv ett ord");
        s3 = JOptionPane.showInputDialog("Med hur många steg vill du förskjuta?");
        t2 = Integer.parseInt(s3);
        
        for (int t=0; t < s1.length(); t++) {
            t1 = (int)(c1 = s1.charAt(t));
            if (t1 >= 90 && t1 < 97) {
                s2 = s2 + Character.toString((char)(t1 + t2 - 26));
            } else if (t1 < 122) {
                s2 = s2 + Character.toString((char)(t1 + t2));
            } else {
                s2 = s2 + Character.toString((char)(t1 + t2 - 26));
            }
    }
        JOptionPane.showMessageDialog(null, "Valt ord: " + s1 + "\nResultat: " + s2);
        
    }
}
