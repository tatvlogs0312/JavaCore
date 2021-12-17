package com.company;

import java.util.ArrayList;

public class Generic <T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj){
        al.add(obj);
    }

    public void disday(){
        for (T obj : al){
            System.out.println(obj);
        }
    }
}
