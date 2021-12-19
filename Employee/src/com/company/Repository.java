package com.company;

public class Repository {
   public Generic<Waiter> addWaiter(){
       Generic<Waiter> waiter =  new Generic<>();
       waiter.add(new Waiter("1","a",16,1000,100));
       waiter.add(new Waiter("2","b",17,1500,50));
       waiter.add(new Waiter("3","c",18,2000,200));

       return waiter;
   }

   public Generic<Kitchen> addKitchen(){
       Generic<Kitchen> kitchen = new Generic<>();
       kitchen.add(new Kitchen("4","d",19,3000,50));
       kitchen.add(new Kitchen("5","e",20,3500,100));
       kitchen.add(new Kitchen("6","f",21,4000,150));

       return kitchen;
   }
}
