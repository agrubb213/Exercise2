package com.Grubb.week2;

public class Main {
    /*
    Austin Grubb
    01/22/2019
    Code that spits out days of the week that will most likely snow.
     */
    public static void main(String[] args) {

        int[] highTemps = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] dayWeek = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        for (int i = 0; i < 7; i++){

            if (precipitation[i] > 49 && highTemps[i] < 33){
                System.out.println(dayWeek[i] + " will most likely snow and have a high of " + highTemps[i]);
            }

        }
    }
}
