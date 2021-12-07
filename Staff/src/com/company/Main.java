package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Staff> listStaff = new ArrayList<>();
        ArrayList<Deverloper> listDev = new ArrayList<>();
        ArrayList<Tester> listTester = new ArrayList<>();

        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.print("Nhập lựa chọn của bạn : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Nhập số lượng Dev muốn thêm : ");
                    int a = sc.nextInt();
                    for (int i = 0 ; i < a ; i++){
                        Deverloper dev = new Deverloper();
                        dev.insertDev();
                        listDev.add(dev);
                        listStaff.add(dev);
                    }
                    break;
                case 2 :
                    System.out.print("Nhập số lượng Tester muốn thêm : ");
                    int b = sc.nextInt();
                    for (int i = 0 ; i < b ; i++){
                        Tester tester = new Tester();
                        tester.insertTester();
                        listTester.add(tester);
                        listStaff.add(tester);
                    }
                    break;
                case 3 :
                    System.out.println("Danh sách nhân viên : ");
                    printStaff(listStaff);
                    break;
                case 4 :
                    System.out.println("Danh sách Dev : ");
                    printDev(listDev);
                    break;
                case 5 :
                    System.out.println("Danh sách Tester : ");
                    printTester(listTester);
                    break;
                default :
                    System.out.println("Kết thúc chương trình !");
                    isCheck = true;
                    System.exit(1);
            }
        }
    }

    public static void printStaff(ArrayList<Staff> listStaff){
        for (Staff staff : listStaff){
            System.out.println(staff);
        }
    }

    public static void printDev(ArrayList<Deverloper> listDev){
        for (Deverloper dev : listDev){
            System.out.println(dev);
        }
    }

    public static void printTester(ArrayList<Tester> listTester){
        for (Tester tester : listTester){
            System.out.println(tester);
        }
    }

    public static void menu(){
        System.out.println();
        System.out.println("-- MENU --");
        System.out.println("1 - Thêm Dev");
        System.out.println("2 - Thêm Tester");
        System.out.println("3 - Danh sách nhân viên");
        System.out.println("4 - Danh sách Dev");
        System.out.println("5 - Danh sách Tester");
        System.out.println("-- Nhập số bất kì để kết thúc chương trình --");
    }
}
