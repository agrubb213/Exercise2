package com.Grubb.week6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by 014291 on 2/19/2019.
 */
/*
Write a class that can be used to collect user input and has three methods:

    public String promptString(String message)
    public int promptInt(String message)
    public double promptDouble(String message)
    Each of these methods should prompt the user for input using the specified message
    and return the a String, int, or double, depending on the method. The methods should
    catch any exceptions due to bad input and continue to prompt the user for input until valid input is supplied.
 */
public class Main {
    static Scanner scan = new Scanner(System.in);

    static String promptString(){
        boolean isSting = false;
        String myString ="";

        while (!isSting){
            try{
                System.out.println("input a String.");
                myString = scan.nextLine();
                double stringCheck1 = Double.parseDouble(myString);
                int stringCheck2 = Integer.parseInt(myString);
                isSting = false;
            }catch (Exception e){
                isSting = true;
            }
        }
        return myString;
    }

    static int promptInt(){
        boolean isInt = false;
        int newInt = 0;

        while (!isInt){
            try{
                System.out.println("input a int.");
                String myInt = scan.nextLine();
                newInt = Integer.parseInt(myInt);
                isInt = true;
            }catch (Exception e){
                System.out.println("Your value is not valid!");
                isInt = false;
            }
        }
        return newInt;
    }

    static double promptDouble(){
        boolean isDouble = false;
        double newDouble = 0;

        while (!isDouble){
            try{
                System.out.println("input a Double.");
                String myDouble = scan.nextLine();
                newDouble = Double.parseDouble(myDouble);
                isDouble = true;
            }catch (Exception e){
                System.out.println("Your value is not valid!");
                isDouble = false;
            }
        }
        return newDouble;
    }


    public static void main(String[] args) {
        promptDouble();
        promptInt();
        promptString();
    }
}