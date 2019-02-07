package com.Grubb.week4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    /*
        2/7/2019
        Austin Grubb
        Enters cities and 5 day forecast then gives you the avg forecast.
    */

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int cityNum = 0;
        Map<String,Double> cities = new TreeMap<>();
        String cityName = " ";
        while(!cityName.equals("END")) {
            System.out.println("Enter ciy name(Enter END to exit)");
            cityName = scan.nextLine();
            if(!cityName.equals("END")){
                cities.put(cityName,0.0);
                }
            }
       for(Map.Entry<String,Double> enter: cities.entrySet()){
           String city = enter.getKey();
           double temp = 0;
           double newTemp = 0;
           System.out.println("List the temps for the next 5 days for this city: " + city );
           for (int i = 1; i < 6; i++) {
               System.out.println("What is the temp at " + city + " the " + i + " day?");
               temp = scan.nextDouble();
               scan.nextLine();
               newTemp = newTemp + temp;
           }
           cities.put(city,(newTemp/5));
       }
        for(Map.Entry<String,Double> enter: cities.entrySet()){
            String city = enter.getKey();
            double temp = enter.getValue();
            System.out.println("City: "+ city + "Temp Avg:"+ temp);
        }
    }
}
