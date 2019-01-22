package com.Grubb.week1;

public class Main {
    /*
   1/17/2019
   Austin Grubb
   Exercise 1
   A program that give a city name , zip , and average high temps.
    */
    public static void main(String[] args) {
        int i = 0;
        double avgTemp = 0;
        int zip = 43123;
        String city = "Grove City";
        int dailyHighs[] = {33, 24, 15, 14, 19};

        for (i = 0; i < dailyHighs.length; i++) {
            avgTemp = avgTemp + dailyHighs[i];
        }
        avgTemp = avgTemp / dailyHighs.length;
        System.out.println("City: " + city + " Zip Code: " + zip + " Average High Temperature: " + avgTemp);
    }
}
