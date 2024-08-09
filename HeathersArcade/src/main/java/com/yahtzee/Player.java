package com.yahtzee;

import java.util.Map;

public class Player {

    private Map<String, Integer> playerCard;
    String name;

    protected void Player(String name){

        this.name = name;
        playerCard.put("1's",null);
        playerCard.put("2's",null);
        playerCard.put("3's",null);
        playerCard.put("4's",null);
        playerCard.put("5's",null);
        playerCard.put("6's",null);
        playerCard.put("Three of a Kind",null);
        playerCard.put("Four of a Kind",null);
        playerCard.put("Small Straight",null);
        playerCard.put("Large Straight",null);
        playerCard.put("Yahtzee!",null);
        playerCard.put("Chance",null);

    }



    
}
