package Kap3;

import javax.swing.*;

class Intvar {
    public static void main (String [] args) {
        
        String s;
        int t1, t2;
        double d1, d2;
        
        s = JOptionPane.showInputDialog("Ange ett tal");
        t1 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Ange ett tal");
        t2 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Ange ett decimaltal");
        d1 = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Ange ett decimaltal");
        d2 = Double.parseDouble(s);
        
        System.out.println("Resultatet blir: " + s + (t1 + d2));
        System.out.println(d2);
        
        
    }
}