package com.ozyegin.cs393.assignment1.beans;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomDailyDiscountSelector implements DailyDiscountSelector{

    @Override
    public int getDailyDiscountRate() {
        Random random = new Random();
        int min = 1;
        int max = 4;

        int randomNumber = random.nextInt((max-min)+1)+min;

        switch(randomNumber){
            case 1:
                return 15;
            case 2:
                return 20;
            case 3:
                return 25;
            case 4:
                return 30;
            default:
                return 0;
        }
    }
}
