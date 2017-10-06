/*
 * Skapa en miniräknare som kan ta emot fyra olika tal (tre operatorer).
 * Idiotsäkra?
 * Mer än +-/* ? 
 */
package Kap3;

import java.util.InputMismatchException;
import javax.swing.*;

class Mini2 {
    public static void main (String [] args) {
        String s1, s2, s3, s4, s5, s6, s7;
        double d1, d2, d3, d4;
        
        s1 = JOptionPane.showInputDialog("Hur många termer kommer du att räkna med? (max 4)");
        
        if ("1".equals(s1)) {
            
        } else if ("2".equals(s1)) {
          s1 = JOptionPane.showInputDialog("Skriv ett tal ");
          s2 = JOptionPane.showInputDialog("Välj en operator");
          s3 = JOptionPane.showInputDialog("Välj ett tal");
          
          d1 = Double.parseDouble(s1);
          d2 = Double.parseDouble(s3);
          
          switch (s2) {
              case "+":
                JOptionPane.showMessageDialog(null,"Dina val leder till: " + d1 + " + " + d2 + " \nDitt svar är " + Double.toString(d1 + d2));
                break;
            
            case "-":
                JOptionPane.showMessageDialog(null,"Dina val leder till: " + d1 + " - " + d2 + " \nDitt svar är " + Double.toString(d1 - d2));
                break;
                
            case "/":
                if (d2 == 0) {
                JOptionPane.showMessageDialog(null, "Det går inte att dividera med noll");
                System.exit(0);
                } else {
                JOptionPane.showMessageDialog(null,"Dina val leder till: " + d1 + " / " + d2 + " \nDitt svar är " + Double.toString(d1 / d2));
                break;
                }        
            case "*":
                JOptionPane.showMessageDialog(null,"Dina val leder till: " + d1 + " * " + d2 + " \nDitt svar är " + Double.toString(d1 * d2));
                break;
                
            /**case "^":
                JOptionPane.showMessageDialog(null,"Dina val leder till: " + d1 + " ^ " + d2 + " \nDitt svar är " + Math.pow(d1, d2));
                break;
                */
        }
          
        } else if ("3".equals(s1)) { //Snygga till cases, glöm inte Double.toString(...)
          s1 = JOptionPane.showInputDialog("Skriv ett tal ");
          s2 = JOptionPane.showInputDialog("Välj en operator");
          s3 = JOptionPane.showInputDialog("Välj ett tal");
          s4 = JOptionPane.showInputDialog("Välj en operator");
          s5 = JOptionPane.showInputDialog("Välj ett tal");
          
          d1 = Double.parseDouble(s1);
          d2 = Double.parseDouble(s3);
          d3 = Double.parseDouble(s5);
                  
          switch (s2) {
              case "+": 
              switch (s4) {
                  case "+":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "+" + d3 + "=" + Double.toString(d1 + d2 + d3));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "-" + d3 + "=" +  Double.toString(d1 + d2 - d3));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "/" + d3 + "=" +  Double.toString(d1 + d2 / d3));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "*" + d3 + "=" +  Double.toString(d1 + d2 * d3));
                  break;
            } break;
              case "-":
              switch (s4) {
                  case "+":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "+" + d3 + "=" +  Double.toString(d1 - d2 + d3));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "-" + d3 + "=" +  Double.toString(d1 - d2 - d3));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "/" + d3 + "=" +  Double.toString( d1 - d2 / d3));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "*" + d3 + "=" +  Double.toString( d1 - d2 * d3));
                  break;    
            } break;
              case "/":
              switch (s4) {
                  case "+":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "+" + d3 + "=" +  Double.toString( d1 / d2 + d3));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "-" + d3 + "=" +  Double.toString(d1 / d2 - d3));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "/" + d3 + "=" +  Double.toString(d1 / d2 / d3));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "*" + d3 + "=" +  Double.toString(d1 / d2 * d3));
                  break;    
            } break;
              case "*":
              switch (s4) {
                  case "+":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "+" + d3 + "=" +  Double.toString(d1 * d2 + d3));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "-" + d3 + "=" +  Double.toString(d1 * d2 - d3));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "/" + d3 + "=" +  Double.toString(d1 * d2 / d3));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "*" + d3 + "=" +  Double.toString(d1 * d2 * d3));
                  break;    
            } break;
          }
              
          
        } else if ("4".equals(s1)) {
          s1 = JOptionPane.showInputDialog("Skriv ett tal ");
          s2 = JOptionPane.showInputDialog("Välj en operator");
          s3 = JOptionPane.showInputDialog("Välj ett tal");
          s4 = JOptionPane.showInputDialog("Välj en operator");
          s5 = JOptionPane.showInputDialog("Välj ett tal");
          s6 = JOptionPane.showInputDialog("Välj en operator");
          s7 = JOptionPane.showInputDialog("Välj ett tal");
          
          d1 = Double.parseDouble(s1);
          d2 = Double.parseDouble(s3);
          d3 = Double.parseDouble(s5);  
          d4 = Double.parseDouble(s7);
          
          switch (s2) {
          case "+":
              switch (s4) {
              case "+":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "+" + d3 + "+" + d4 + "=" + Double.toString(d1 + d2 + d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "+" + d3 + "-" + d4 + "=" + Double.toString(d1 + d2 + d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "+" + d3 + "/" + d4 + "=" + Double.toString(d1 + d2 + d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "+" + d3 + "*" + d4 + "=" + Double.toString(d1 + d2 + d3 * d4));
                  break;
            } break;

              case "-":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "-" + d3 + "+" + d4 + "=" + Double.toString(d1 + d2 - d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "-" + d3 + "-" + d4 + "=" + Double.toString(d1 + d2 - d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "-" + d3 + "/" + d4 + "=" + Double.toString(d1 + d2 - d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "-" + d3 + "*" + d4 + "=" + Double.toString(d1 + d2 - d3 * d4));
                  break;
            } break;
              case "/":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "/" + d3 + "+" + d4 + "=" + Double.toString(d1 + d2 / d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "/" + d3 + "-" + d4 + "=" + Double.toString(d1 + d2 / d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "/" + d3 + "/" + d4 + "=" + Double.toString(d1 + d2 / d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "/" + d3 + "*" + d4 + "=" + Double.toString(d1 + d2 / d3 * d4));
                  break;
            } break;   
              case "*":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "*" + d3 + "+" + d4 + "=" + Double.toString(d1 + d2 * d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "*" + d3 + "-" + d4 + "=" + Double.toString(d1 + d2 * d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "*" + d3 + "/" + d4 + "=" + Double.toString(d1 + d2 * d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "+" + d2 + "*" + d3 + "*" + d4 + "=" + Double.toString(d1 + d2 * d3 * d4));
                  break;
            } break;
          
    }      case "-":
            switch (s4) {
              case "+":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "+" + d3 + "+" + d4 + "=" + Double.toString(d1 - d2 + d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "+" + d3 + "-" + d4 + "=" + Double.toString(d1 - d2 + d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "+" + d3 + "/" + d4 + "=" + Double.toString(d1 - d2 + d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "+" + d3 + "*" + d4 + "=" + Double.toString(d1 - d2 + d3 * d4));
                  break;
            } break;
              case "-":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "-" + d3 + "+" + d4 + "=" + Double.toString(d1 - d2 - d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "-" + d3 + "-" + d4 + "=" + Double.toString(d1 - d2 - d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "-" + d3 + "/" + d4 + "=" + Double.toString(d1 - d2 - d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "-" + d3 + "*" + d4 + "=" + Double.toString(d1 - d2 - d3 * d4));
                  break;
            } break;
              case "/":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "/" + d3 + "+" + d4 + "=" + Double.toString(d1 - d2 / d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "/" + d3 + "-" + d4 + "=" + Double.toString(d1 - d2 / d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "/" + d3 + "/" + d4 + "=" + Double.toString(d1 - d2 / d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "/" + d3 + "*" + d4 + "=" + Double.toString(d1 - d2 / d3 * d4));
                  break;
            } break;
              case "*":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "*" + d3 + "+" + d4 + "=" + Double.toString(d1 - d2 * d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "*" + d3 + "-" + d4 + "=" + Double.toString(d1 - d2 * d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "*" + d3 + "/" + d4 + "=" + Double.toString(d1 - d2 * d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "-" + d2 + "*" + d3 + "*" + d4 + "=" + Double.toString(d1 - d2 * d3 * d4));
                  break;   
   } break;
             
  }         case "*":
            switch (s4) {
              case "+":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "+" + d3 + "+" + d4 + "=" + Double.toString(d1 * d2 + d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "+" + d3 + "-" + d4 + "=" + Double.toString(d1 * d2 + d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "+" + d3 + "/" + d4 + "=" + Double.toString(d1 * d2 + d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "+" + d3 + "*" + d4 + "=" + Double.toString(d1 * d2 + d3 * d4));
                  break;
            } break;
              case "-":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "-" + d3 + "+" + d4 + "=" + Double.toString(d1 * d2 - d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "-" + d3 + "-" + d4 + "=" + Double.toString(d1 * d2 - d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "-" + d3 + "/" + d4 + "=" + Double.toString(d1 * d2 - d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "-" + d3 + "*" + d4 + "=" + Double.toString(d1 * d2 - d3 * d4));
                  break;
            } break;
              case "/":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "/" + d3 + "+" + d4 + "=" + Double.toString(d1 * d2 / d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "/" + d3 + "-" + d4 + "=" + Double.toString(d1 * d2 / d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "/" + d3 + "/" + d4 + "=" + Double.toString(d1 * d2 / d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "/" + d3 + "*" + d4 + "=" + Double.toString(d1 * d2 / d3 * d4));
                  break;
            } break;
              case "*":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "*" + d3 + "+" + d4 + "=" + Double.toString(d1 * d2 * d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "*" + d3 + "-" + d4 + "=" + Double.toString(d1 * d2 * d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "*" + d3 + "/" + d4 + "=" + Double.toString(d1 * d2 * d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "*" + d2 + "*" + d3 + "*" + d4 + "=" + Double.toString(d1 * d2 * d3 * d4));
                  break;   
 }
}   case "/":
            switch (s4) {
              case "+":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "+" + d3 + "+" + d4 + "=" + Double.toString((d1 / d2) + d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "+" + d3 + "-" + d4 + "=" + Double.toString(d1 / d2 + d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "+" + d3 + "/" + d4 + "=" + Double.toString(d1 / d2 + d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "+" + d3 + "*" + d4 + "=" + Double.toString(d1 / d2 + d3 * d4));
                  break;
            } break;
              case "-":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "-" + d3 + "+" + d4 + "=" + Double.toString((d1 / d2) - d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "-" + d3 + "-" + d4 + "=" + Double.toString(d1 / d2 - d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "-" + d3 + "/" + d4 + "=" + Double.toString(d1 / d2 - d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "-" + d3 + "*" + d4 + "=" + Double.toString(d1 / d2 - d3 * d4));
                  break;
            } break;
              case "/":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "/" + d3 + "+" + d4 + "=" + Double.toString(d1 / d2 / d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "/" + d3 + "-" + d4 + "=" + Double.toString(d1 / d2 / d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "/" + d3 + "/" + d4 + "=" + Double.toString(d1 / d2 / d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "/" + d3 + "*" + d4 + "=" + Double.toString(d1 / d2 / d3 * d4));
                  break;
            } break;
              case "*":
                  switch (s6) {
                  case "+": 
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "*" + d3 + "+" + d4 + "=" + Double.toString(d1 / d2 * d3 + d4));
                  break;
                  
                  case "-":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "*" + d3 + "-" + d4 + "=" + Double.toString(d1 / d2 * d3 - d4));
                  break;
                  
                  case "/":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "*" + d3 + "/" + d4 + "=" + Double.toString(d1 / d2 * d3 / d4));
                  break;
                  
                  case "*":
                  JOptionPane.showMessageDialog(null,"Du skrev: " + d1 + "/" + d2 + "*" + d3 + "*" + d4 + "=" + Double.toString(d1 / d2 * d3 * d4));
                  break;   
     }
    }
   }
  }
 }
}

        
