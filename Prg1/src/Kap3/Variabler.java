/*
 * Nytt i Kap3, genomgång 2 sista variabel, int och double
 * samt omvandling från String till int eller double
 */

package Kap3;

import javax.swing.*;

class Variabler {
    public static void main (String [] args) {
        String s, s2, s3, s4, s5, s6;
            s = JOptionPane.showInputDialog("Ange tal ett");
        System.out.println(s);
        
        s2 = JOptionPane.showInputDialog("Ange tal två");
        System.out.println(s2);
        JOptionPane.showMessageDialog(null, s + s2); //I string OBS Ingen addition
        
        int t1, t2;  //Heltal
        
        
        s3 = JOptionPane.showInputDialog("Ange tal tre");
        
        t1 = Integer.parseInt(s3);  //Omvandlar s3 till int
        System.out.println(t1 + t1); //Nu blir det addition
        
        s4 = JOptionPane.showInputDialog("Ange tal fyra");
        
        t2 = Integer.parseInt(s4);
        
        System.out.println(t1 - t2); 
        
        double d1, d2; //Decimaler
        
        s5 = JOptionPane.showInputDialog("Ange ett decimaltal");
        d1 = Double.parseDouble(s5);
        
        s6 = JOptionPane.showInputDialog("Ange ett annat decimaltal");
        d2 = Double.parseDouble(s6);
        
        System.out.println(d1 +d2);
       
        
               
        
        
        
        
        
    }
}