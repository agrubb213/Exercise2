package com.Grubb.week5;

import java.util.ArrayList;

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
public class AddressBook {
    private ArrayList<Person> personList = new ArrayList<>();

    public void  setPerson(Person personName){
        personList.add(personName);
    }
    public String getEmail(String personName){
        String email = "DID NOT WORK!";
        for(Person person : personList){
           if (person.getName().equalsIgnoreCase(personName)){
               email = person.getEmail();
           }
        }
        return email;
    }
}
