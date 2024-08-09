package com.main;

import com.kb.Kb;
import com.yahtzee.Yahtzee;

import java.util.Arrays;
import java.util.List;

public class DiceGames extends Main{

    private List<Integer> menuTotal = Arrays.asList(1,2,3);

    public static void main(String[] args) {
        DiceGames dG = new DiceGames();
        dG.run();
    }

    private void run(){
        boolean leaveDiceGames = false;
        while(!leaveDiceGames) {
            int gameChoice = whichDiceGame();
            if (gameChoice != menuTotal.getLast()) {
                playGame(gameChoice);
            } else {
                System.out.println("Ending dice games");
                leaveDiceGames = true;
            }
        }
    }

    private int whichDiceGame(){
        while(true){
            printDiceGames();
            int choice = generateInput();
            if(menuTotal.contains(choice)){
                return choice;
            }
        }
    }

    private static void printDiceGames(){
        System.out.println("");
        System.out.println("1: Knucklebones");
        System.out.println("2: Yahtzee");
        System.out.println("3: Return to main menu");
    }

    private void playGame(int gameChoice){
        if(gameChoice == 1){
            Kb.main(null);
        }else if(gameChoice == 2){
            Yahtzee.main(null);
        }else{

        }
    }

}
