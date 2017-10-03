/*
 * Skapa en miniräknare som kan ta emot två valfria heltal samt utföra
 * alla fyra räknesätt
 */
package Kap3;

import javax.swing.*;

class Miniräknare {
    public static void main (String [] args) {
        
        String s1, s2, s3;
        double t1, t2;
        
        s3 = JOptionPane.showInputDialog("Välj räknesätt, dvs +, -, *, / eller ^");
        
         //if ("^".equals(s3)) {
            //JOptionPane.showMessageDialog(null, "Detta räknesätt fungerar bara med naturliga tal!");
            //Jag trodde att ^ inte fungerade med decimaltal
                
         //{
       
        if ("".equals(s3)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett giltigt räknesätt!");
            System.exit(0);     
        }
        
        s1 = JOptionPane.showInputDialog("Skriv ett tal");
        
        if ("".equals(s1)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett tal!");
            System.exit(0);
        }
        s2 = JOptionPane.showInputDialog ("Skriv ett till tal");
        
        if ("".equals(s2)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett tal!");
            System.exit(0);
        }
        
        t1 = Double.parseDouble(s1);
        t2 = Double.parseDouble(s2);
        
        
        
        switch (s3) {
            case "+":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 + t2));
            
            case "-":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 - t2));
                
            case "/":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 / t2));
                         
            case "*":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 * t2));
                
            case "^":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.pow(t1, t2));
                
            default:
                break;
                
                
        


        
        
        }
    }
}