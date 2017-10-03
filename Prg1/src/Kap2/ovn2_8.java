package Kap2;

import javax.swing.*;

class Ovn2_8 {
    public static void main (String [] args) {
       
        
        String a, b;
        a = "Programspråk";
        b = a.toUpperCase().charAt(4) + a.substring(5, 8) + a.charAt (5);
        
        System.out.println(b);
    }
}