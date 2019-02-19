package com.Grubb.week5;

import java.util.Scanner;

/**
 * Created by 014291 on 2/12/2019.
 */
/*
  Create a class that represents contact information for a person. The class should store the person's name and their email address.
  Create a second class that represents an address book (a collection of contact information for many people)
  that includes methods for adding new contact information and for searching the existing collection for a contacts
  email address when the name is specified.
  The program should create instances of the classes and demonstrate the functionality.
*/
public class Main {
    static Scanner scan = new Scanner(System.in);

    static void addPersonMethod(AddressBook addPeople){
        String getName = "";
        System.out.println("Who are you adding?");
        getName = scan.nextLine();
        System.out.println("What is the email?");
        String getEmail = scan.nextLine();
        Person newPerson = new Person(getName,getEmail);
        addPeople.setPerson(newPerson);
    }
    static void findPersonMethod (AddressBook findPerson){
        String getName = "";
        System.out.println("Who do you want to look up?");
        getName = scan.nextLine();
        System.out.println("The email for " + getName+ " is " + findPerson.getEmail(getName));
    }

    public static void main(String[] args) {
        int choice;
        Person Steve = new Person("Steve" , "ats@gmail.com");
        Person Hud = new Person("Hud" , "ats@gmail.com");
        AddressBook addPeople = new AddressBook();
        addPeople.setPerson(Steve);
        addPeople.setPerson(Hud);
        do{
            System.out.println("1) To add people" +
                    "\n2) To look up someones email" +
                    "\n3) exit");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1: addPersonMethod(addPeople);
                    break;
                case 2: findPersonMethod(addPeople);
                    break;
            }
        }while(choice != 0);
    }
}
