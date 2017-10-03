package Kap3;

import javax.swing.*;

class Okningminskning {
    public static void main (String [] args) {
        
        int a, b;
        String s;
        
        a=0; b=a++;
        //a=a+1 samma sak som a++
        
        System.out.println(a);
        a=b;
        System.out.println(b);
        
        s= "\n a=0: Efter b=a++ blir b= " +b + " och a = " + a + "        \n";
        JOptionPane.showMessageDialog(null, s);
        
        int c, d;
        c=0;
        d=++c;
        String s1;
        s1="\n c=0; Efter d=++c blir c=" + c +" och d = " + d + "           \n";
        JOptionPane.showMessageDialog(null, s1);
             
    }
}

