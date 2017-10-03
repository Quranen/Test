package Kap1;

import javax.swing.*; // X är en förkortning för Linux

import java.util.*; //hämta system och tid/datum inställningar

class Ovn3{
    public static void main (String [] args){
       JOptionPane.showMessageDialog(null,"Hej\n" +
               System.getProperty ("user.name") + "!"); 
       
    }
}