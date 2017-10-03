package Kap2; 

import javax.swing.*;

class TonyOvn1 {
    public static void main (String [] args) {
        
        String namn, kurs; //variabeldeklaration steg 1 och 2
        namn = JOptionPane.showInputDialog("Vad heter du?");
        
        System.out.println(namn);   //Terminalprogrammering
        JOptionPane.showMessageDialog(null, namn, "Välkomsthälsning", 1);
        
        namn = JOptionPane.showInputDialog(null, "What is your name?", "Läsa in namnet", 0);
        //0, 1, 2, 3 är alla olika sätt att ange meddelandetyper
    }
}
