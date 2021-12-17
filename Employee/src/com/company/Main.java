package com.company;

public class Main {

    public static void main(String[] args) {
        Generic<Waiter> waiter = new Generic<>();
        waiter.add(new Waiter("1","a",16,1000,100));
        waiter.add(new Waiter("2","b",17,1500,50));
        waiter.add(new Waiter("3","c",18,2000,200));
        System.out.println("Danh sách bồi bàn : ");
        waiter.disday();

        Generic<Kitchen> kitchen = new Generic<>();
        kitchen.add(new Kitchen("4","d",19,3000,50));
        kitchen.add(new Kitchen("5","e",20,3500,100));
        kitchen.add(new Kitchen("6","f",21,4000,150));
        System.out.println("Danh sách đầu bếp : ");
        kitchen.disday();
    }
}
