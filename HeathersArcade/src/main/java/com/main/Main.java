package com.main;

import com.kb.Kb;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<Integer> gamesChoices = Arrays.asList(1,2,3,4);

    private Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Main application = new Main();
        application.run();
    }


    private void run(){
        System.out.println("Welcome to Heather's arcade!");
        System.out.println("Earn coins by playing games");
        System.out.println("Spend coins in the shop");

        while(wantToPlay()){
            int gameChoice = whichGame();
            playGames(gameChoice);
        }
    }

    private boolean wantToPlay(){
        while(true){
            System.out.println("1: Play games, 2: Leave arcade");
            int choice = generateInput();
            if(choice == 1){
                return true;
            }else if(choice == 2){
                return false;
            }
        }

    }




    //prints choice and returns an in that fits on the choice table
    //choice table is 1-4 Dice, Card, Board and Shop respectively.
    private int whichGame(){
        boolean validSelection = false;

        int choice = 0;

        while(!validSelection){
            printChoices();
            choice = generateInput();
            if(gamesChoices.contains(choice)){
                validSelection = true;
            }
        }
        return choice;
    }

    //prints game and shop choices
    private void printChoices(){
        System.out.println("Which game would you like to play?");
        System.out.println("1: Dice, 2: Card, 3: Board, 4: Shop");
    }

    //gets back a valid integer
      int generateInput(){
        while(true){
            try{
                return Integer.parseInt(userInput.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Give a number in digit form");
            }
        }
    }

    private void playGames(int gameChoice){
        if(gameChoice == 1){
            DiceGames.main(null);
        }else if(gameChoice == 2){
            CardGames.main(null);
        }else if(gameChoice == 3){
            BoardGames.main(null);
        }else{
            Shop.main(null);
        }
    }

}
