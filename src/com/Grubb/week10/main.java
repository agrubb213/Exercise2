package com.Grubb.week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 014291 on 3/19/2019.
 */
/*
Create a class to store contact information consisting of a name and email address.
 Additionally, create a class to store a collection of contacts that implements the Iterable
  interface so that a for-each loop can be used with the the collection class. Demonstrate this
  functionality with a for-each loop in the Main.main() method that displays contact information.
 */
class Contact{
    public String name;
    public String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void toDisplay(){
        System.out.println(name + " " + email);
    }

}
class ContactCollection implements Iterable<Contact>{
    public List<Contact> list = new ArrayList<>();

    @Override
    public Iterator<Contact> iterator() {
        return this.list.iterator();
    }
    public void addList(Contact contact){
        list.add(contact);
    }
    public void forEach(){
        list.forEach((contact) -> contact.toDisplay());
    }

}
public class main {
    public static void main(String[] args) {
        Contact person1 = new Contact("Austin","ajg0525@att.net");
        Contact person2 = new Contact("Grubb","ajg0525@yahoo.com");
        Contact person3 = new Contact("James","ajg0525@gmail.com");
        ContactCollection list = new ContactCollection();
        list.addList(person1);
        list.addList(person2);
        list.addList(person3);
        list.forEach();
    }
}
