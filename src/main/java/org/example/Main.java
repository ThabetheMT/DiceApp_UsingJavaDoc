package org.example;

import oop.ct1.dice.Dice;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Guess a number between 1 to 6"));

        while(userGuess > 6 || userGuess < 1){
            userGuess = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Invalid!...Guess a number between 1 to 6"));
        }
        
        Dice dice = new Dice();
        dice.roll();
        int computerRoll = dice.getValue();

        if(userGuess == computerRoll){
            JOptionPane.showMessageDialog(null,"You guessed correct"+"\n" +
                    "Computer rolled: "+ computerRoll+"\n"+
                    "User guess: " + userGuess);
        }else if(userGuess < computerRoll){
            JOptionPane.showMessageDialog(null,"You guessed lower"+"\n" +
                    "Computer rolled: "+ computerRoll+"\n"+
                    "User guess: " + userGuess);
        }else{
            JOptionPane.showMessageDialog(null,"You guessed higher"+"\n" +
                    "Computer rolled: "+ computerRoll+"\n"+
                    "User guess: " + userGuess);
        }

    }
}