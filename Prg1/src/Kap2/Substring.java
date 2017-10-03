package Kap2;

import javax.swing.*;

class Substring {
    public static void main (String [] args) {
        
        String a, b;
        int i, j;        
        a = " Erik Andersson 860314-2714 ";
        //a = a.trim();

        b = a.substring(15, 22);
        
        System.out.println(b);

    }
}