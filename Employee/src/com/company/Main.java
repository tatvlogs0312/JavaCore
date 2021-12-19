package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.print("Nhập lựa chọn : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    service.printListWaiter();
                    break;
                case 2:
                    service.printListKitchen();
                    break;
                case 3:
                    service.printListWaiter();
                    service.printListKitchen();
                    break;
                default:
                    System.out.println("Đóng chương trình");
                    isCheck = true;
                    System.exit(1);
            }
        }

    }
    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("1 - Xem danh sách bồi bàn");
        System.out.println("2 - Xem danh sách đầu bếp");
        System.out.println("3 - Xem tất cả nhân viên");
        System.out.println("Nhấn bất kỳ để dừng chương trình");
    }
}
