package com.example.tugasakhirtam.RecyclerViewAll;

import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{

    };
    public static ArrayList<Contact> getListData(){
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            contact = new Contact();
            contact.setName(data[i][0]);
            contact.setPhoto(data[i][1]);
            list.add(contact);
        }
        return list;
    }
}
