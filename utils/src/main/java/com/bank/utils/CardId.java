package com.bank.utils;

import java.util.Random;

public class CardId {

    public static String getCardId(){
        Random random = new Random();
        String cardId = "";
        for(int i = 0;i<18;i++){
           int x = random.nextInt(9);
           cardId +=x;
        }
        return cardId;
    }

    public static void main(String []args){
        System.out.println(getCardId());
    }
}
