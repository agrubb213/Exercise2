package com.Grubb.week3;

import java.util.Scanner;

public class Main {
    /*
        2/4/2019 Austin Grubb
        takes f to c
     */
     static void convertC(double c){
        c -= 32;
        c = c*5/9;
        System.out.println(c);
        out(c);
    }
    static void out(double newtemp){
        System.out.println("Your new Temp is "+ newtemp+ " in c!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp = 0;
        while(!(temp == -460)){
            System.out.println("Input a temp in F to be converted to C.(-460 to exit)");
            temp = scan.nextDouble();
            convertC(temp);
        }


    }
}
