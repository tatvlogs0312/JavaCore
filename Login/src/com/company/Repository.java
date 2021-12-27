package com.company;

import java.util.ArrayList;

public class Repository {
    public ArrayList<User> getData(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("a","a@gmail.com","Aaaaaa."));
        list.add(new User("b","b@gmail.com","Bbbbbb."));
        list.add(new User("c","b@gmail.com","Cccccc."));
        list.add(new User("d","c@gmail.com","Dbbbbb."));

        return list;
    }
}
