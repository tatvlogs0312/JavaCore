package com.company;

public class Service {
    Repository repository = new Repository();
    Generic<Waiter> listWaiter = repository.addWaiter();
    Generic<Kitchen> listKitchen = repository.addKitchen();

    public void printListWaiter(){
        System.out.println("Danh sách bồi bàn : ");
        listWaiter.disday();
    }

    public void printListKitchen(){
        System.out.println("Danh sách đầu bếp : ");
        listKitchen.disday();
    }
}
