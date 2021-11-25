package com.company;

import java.util.Scanner;

public class Simple {
    public void simpleEq(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        double a = sc.nextDouble();
        System.out.print("Nhập b : ");
        double b = sc.nextDouble();

        double x = -b/a ;
        if(a == 0){
            System.out.println("Làm gì có phương trình 0x + b = 0");
            System.out.println("Vô lý");
        } else {
            System.out.println("Nghiệm của phương trình x = " + x);
        }
    }
}
