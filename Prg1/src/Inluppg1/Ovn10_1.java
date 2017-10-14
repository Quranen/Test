package Inluppg1;

import javax.swing.*;

class Ovn10_1 {
    public static void main (String [] args) {
        
        String s1, s2;
        int c1, c2;
        

        String str = "Kalle"; 

        char[] charArray = str.toCharArray(); 

        int pos=0; 

        while (pos<str.length())
        {
            char x = (charArray[pos]); 
            System.out.print((char)(x+5)); 

            pos++;
        }


    }
}
        
        
    
