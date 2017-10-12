package Inluppg1;

import javax.swing.*;

class Fonster {
    public static void main (String [] args) {
        
        Object[] options = {"Ett till kort", "Stanna", "Dubbla"};
        
        int t1 = JOptionPane.showOptionDialog(null, "Vad vill du göra nu?", "Blackjack", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]);
        
    }
}