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
        
        s3 = JOptionPane.showInputDialog("Välj räknesätt, dvs +, -, *, /, ^ , root, log, sin, cos eller tan");
        
        if ("root".equals(s3)) {
            JOptionPane.showMessageDialog(null, "Så här fungerar roten ur:"
                    + "\n1. root fungerar bara med positiva tal."
                    + "\n2. Först anger du i vilken grad du ska göra din rot."
                    + "\n3. Sen anger du talet du ska göra roten ur."
                    + "\nEtt exempel: För att få tredje roten ur åtta anger du först tre sen åtta.");
        } else if ("log".equals(s3)) {
            JOptionPane.showMessageDialog(null,"Så här fungerar logaritmer:"
                    + "\n1. Skriv först i vilken bas du vill logaritmera"
                    + "\n2. Skriv sen vilket tal du vilken logaritmera i den valda basen"
                    + "\nEtt exempel: För att få andralogartimen av åtta skriver du först två för att ange bas och sen åtta.");
        } else if ("".equals(s3)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett giltigt räknesätt!");
            System.exit(0);     
        } else if (null == s3) {
            System.exit(0);
        } else if ("%".equals(s3)) {
            JOptionPane.showMessageDialog(null,"Så här fungerar % eller procent."
                    + "\n1. Ange ett tal"
                    + "\n2. Skriv sen en koefficient"
                    + "\nEtt exempel: Först åtta sen 90 ger: 8 * 0,9" );
        }
        
        s1 = JOptionPane.showInputDialog("Skriv ett tal");
        
        if ("".equals(s1)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett tal!");
            System.exit(0);
        } else if (null == s1) 
          System.exit(0);
        {
            
        s2 = JOptionPane.showInputDialog ("Skriv ett till tal");
        
        if ("".equals(s2)) {
            JOptionPane.showMessageDialog(null, "Snälla skriv ett tal!");
            System.exit(0);
        } else if (null == s2) {
            System.exit(0);
        }
        
        t1 = Double.parseDouble(s1);
        t2 = Double.parseDouble(s2);
        

        
        switch (s3) {
            case "+":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 + t2));
                break;
            
            case "-":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 - t2));
                break;
                
            case "/":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 / t2));
                break;
                         
            case "*":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 * t2));
                break;
                
            case "^":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.pow(t1, t2));
                break;
            
            case "root":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.pow(t2, 1.0/t1));
                break;
                
            case "log":
                JOptionPane.showMessageDialog(null,"Ditt svar är " + Math.log10(t2)/Math.log10(t1));
                break;
                
            case "%":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Double.toString(t1 * (t2/100)));
               break;
            
            case "sin":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.sin(Math.toDegrees(t1)));
                break;
            case "cos":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.cos(Math.toDegrees(t1)));
                break;
            case "tan":
                JOptionPane.showMessageDialog(null, "Ditt svar är " + Math.tan(Math.toDegrees(t1)));
                break;

            default:
                break;
                
      }
    }
  }
}

    


    
            
                
        


        
        
        
    
