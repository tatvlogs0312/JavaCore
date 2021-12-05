package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<>();

        list.add(new Player(1,"a",Position.GK));
        list.add(new Player(2,"b",Position.GK));
        list.add(new Player(3,"c",Position.DF));
        list.add(new Player(4,"d",Position.DF));
        list.add(new Player(5,"e",Position.DF));
        list.add(new Player(6,"f",Position.DF));
        list.add(new Player(7,"g",Position.DF));
        list.add(new Player(8,"h",Position.DF));
        list.add(new Player(9,"i",Position.DF));
        list.add(new Player(10,"j",Position.DF));
        list.add(new Player(11,"k",Position.MF));
        list.add(new Player(12,"l",Position.MF));
        list.add(new Player(13,"m",Position.MF));
        list.add(new Player(14,"n",Position.MF));
        list.add(new Player(15,"o",Position.MF));
        list.add(new Player(16,"p",Position.MF));
        list.add(new Player(17,"q",Position.MF));
        list.add(new Player(18,"r",Position.MF));
        list.add(new Player(19,"s",Position.FW));
        list.add(new Player(20,"t",Position.FW));
        list.add(new Player(21,"u",Position.FW));
        list.add(new Player(22,"v",Position.FW));

        printlist(list);

        DoiHinh1 a = new DoiHinh1();
        System.out.println("Đội hình 1 - 4 - 4 - 2 : ");
        a.DoiHinh1(list);

        DoiHinh2 b = new DoiHinh2();
        System.out.println("Đội hình 1 - 4 - 3 - 3 : ");
        b.DoiHinh2(list);

        DoiHinh3 c = new DoiHinh3();
        System.out.println("Đội hình 1 - 3 - 5 - 2 : ");
        c.DoiHinh3(list);
    }

    public static void printlist(ArrayList<Player> list){
        for (Player p: list) {
            System.out.println(p);
        }
    }
}
