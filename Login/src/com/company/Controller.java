package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void MenuLogin(){
        Scanner sc = new Scanner(System.in);
        Repository repository = new Repository();
        Service service = new Service();
        Check check = new Check();
        ArrayList<User> list = repository.getData();
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("1 - Đăng nhập ");
            System.out.println("2 - Đăng kí");
            int choice = check.checkChoice();
            switch (choice){
                case 1:
                    service.Login(list);
                    break;
                case 2:
                    list.add(service.Register(list));
                    System.out.println("Tạo thành công !");
                default:
                    System.out.println("không có lựa chọn này !");
            }
        }
    }

    public static void printList(ArrayList<User> list){
        list.stream().forEach(i -> System.out.println(i));
    }
}
