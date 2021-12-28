package com.sylvie;

import java.util.Random;

public class OneCardGame {
    public static void main(String[] args) {
        char [] types= {'c','d','h','s'};
        String tt = "cdhs";
        Random random = new Random();
        //prepare cards
        int [] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i]=i;
            System.out.print(cards[i]+" ");
        }
        System.out.println();
        //shuffle
        for (int i = 0; i < 52; i++) {
            int r = random.nextInt(52);
            int tmp = cards[i];
            cards[i]=cards[r];
            cards[r]=tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i]+" ");
        }
        System.out.println();

        //0-51,52 cards
        System.out.println("Computer's Cards:");
        int computer = cards[0];
        int computerPoint = computer%13+1;
        int computerType = computer/13;
        System.out.println(computerPoint+""+types[computerType]+"("+computer+")");
        //player's cards
        int player = cards[1];
        int playerPoint = player%13+1;
        int playerType = player/13;
        System.out.println(playerPoint+""+types[playerType]+"("+playerPoint+")");
        computerPoint=computerPoint==1?14:computerPoint;
        playerPoint=playerPoint==1?14:playerPoint;
        if (playerPoint > computerPoint || (playerPoint==computerPoint && playerType>computerType) ){
            System.out.println("You win!");
        }else{
            System.out.println("You loose!");
        }
    }
}
