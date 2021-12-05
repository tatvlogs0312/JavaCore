package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Films> list = new ArrayList<>();
        list.add(new Films(1,"Điệp viên 007" , "Action" , 3 , "abc" , 2018));
        list.add(new Films(2,"One Piece: Stampede" , "Cartoon" , 2 , "Toei Animation" , 2019));
        list.add(new Films(3,":))" , "Horror" , 3 , "abd" , 2017));
        list.add(new Films(4,":((" , "Phiêu lưu , kỳ ảo" , 1 , "abe" , 2020));
        list.add(new Films(5,"asd" , "Action" , 2 , "abg" , 2021));

        printlist(list);

        String str = "Action" ;
        System.out.println("Film thuộc thể loại Action : ");
        for (int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getCategory().toLowerCase().equals(str.toLowerCase())){
                System.out.println(list.get(i));
            }
        }
    }

    public static void printlist(ArrayList<Films> list){
        for (Films str : list ) {
            System.out.println(str);
        }
    }
}
