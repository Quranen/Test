package Inluppg1;

import javax.swing.*;

class Ovn7 {
    public static void main (String [] args) {
        
        String s1;
        int t1, t2, t3, t4;
        
        s1 = JOptionPane.showInputDialog("Hur många ören har du?");
        
        t1 = Integer.parseInt(s1);
        t2 = t1 / 100;
        if (t1 >= 1000) {
            t2 = t1 / 1000;
            System.out.println("Tiokronor: " + t2);
            System.exit(0);
        } 
        if (t1 >= 100) {
            t2 = t1 / 100;
            System.out.println("Enkronor: " + t2);
            System.exit(0);
        } 
        if (t2 >= 5) {
            t3 = t2 / 5;
            System.out.println("Femkronor: " + t3);
            System.exit(0);
        }
        if (t1 >= 50)
            t2 = t1 / 50;
        System.out.println("Femtioören: " + t2);
        System.exit(0);
    }
}