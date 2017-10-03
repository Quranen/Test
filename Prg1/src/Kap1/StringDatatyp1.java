/*
 * Datatyp string
 */



package Kap1;

import javax.swing.*;

class StringDatatyp1 {
    public static void main (String [] args){
        //Kan ni se skillnad på string och string?
       
        
        String s1, s2;
        s1="Hej";
        s2=s1; //Får samma värde som s1?
            JOptionPane.showMessageDialog (null, s2);
            
            s2=s2 + " på dig!";
                    JOptionPane.showMessageDialog (null, s2);
                    
        String s3,s4;
        s3="5";
        s4="6";
        JOptionPane.showMessageDialog(null, "s3 och s4 får värdet " + s3 + s4);
        
        String s5;
        s5=s2 + s3 + s4;
  
        JOptionPane.showMessageDialog(null, s5);

}
}