package Kap2;

import javax.swing.*;

class Ovn2_9 {
    public static void main (String [] args) {
        
        String a, b;
        int i, j;        
        a = " Erik Andersson 860314-2714 ";
        a = a.trim();   //Man gör en exakt kopia av a och tar bort onödiga mellanslag
        //i början och slutet av texten

       i = a.lastIndexOf (' ') + 1;
        j = a.indexOf('-');
        b = a.substring (i, j);
        
        System.out.println(b);

        b = b.substring(4, 6) + "/" + b.substring(2, 4);
        
        System.out.println(b);

    }
}