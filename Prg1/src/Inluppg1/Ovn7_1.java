//Detta är den mest funktionella versionen av uppgift 7, den andra använder if-satser men fungerar inte lika bra.
package Inluppg1;

import javax.swing.*;

class Ovn7_1 {
    public static void main (String [] args) {
        
        String s1;
        int tio, fem, ett, femtio, femmod, ettmod, start;
        
        s1 = JOptionPane.showInputDialog("Skriv ett antal ören");
        start = Integer.parseInt(s1);
        
        tio = start / 1000;
        
        femmod = (start % 1000);
        fem = femmod / 500;
        
        ettmod = (femmod % 500);
        ett = ettmod / 100;
        
        femtio = (ettmod % 100) / 50;
        
        JOptionPane.showMessageDialog(null, "Det blir: " + "\n" + tio + " Tiokronor" + 
        "\n" +  fem + " Femkronor" + "\n" + ett + " Enkronor" + "\n" +  femtio + " Femtioören");
        
        
        
      
        
        
        
        
    }
}
