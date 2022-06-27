package com.example.tugasakhirtam.RecyclerViewAll;

import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Lia", "https://static.wikia.nocookie.net/itzy/images/1/19/ITZY_IT%27z_ICY_Lia_Promotional_Picture_%283%29.jpg/revision/latest/scale-to-width-down/800?cb=20190731232254"},
            {"Yuna", "https://static.wikia.nocookie.net/itzy/images/3/3f/ITZY_IT%27z_ICY_Yuna_Promotional_Picture_%283%29.jpg/revision/latest/scale-to-width-down/800?cb=20190731233255"},
            {"Ryujin", "https://static.wikia.nocookie.net/itzy/images/8/80/ITZY_IT%27z_ICY_Ryujin_Promotional_Picture_%283%29.jpg/revision/latest/scale-to-width-down/800?cb=20190731233251"},
            {"Chaeryong", "https://static.wikia.nocookie.net/itzy/images/3/3c/ITZY_IT%27z_ICY_Chaeryeong_Promotional_Picture_%283%29.jpg/revision/latest/scale-to-width-down/800?cb=20190731233253"},
            {"Yeji", "https://static.wikia.nocookie.net/itzy/images/b/bc/ITZY_IT%27z_ICY_Yeji_Promotional_Picture_%283%29.jpg/revision/latest/scale-to-width-down/800?cb=20190731232252"},
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
