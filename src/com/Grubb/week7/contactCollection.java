package com.Grubb.week7;

import java.util.ArrayList;

/**
 * Created by 014291 on 3/5/2019.
 */
public class contactCollection {
    ArrayList<Contact> list = new ArrayList();

    public void addTo(Contact a){
        list.add(a);
    }
    public void showList(){
        for(Contact getContact: list){
            getContact.display();
        }
    }
}
