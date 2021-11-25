package com.company;

import java.util.Scanner;

public class Quadratic {
    public void QuadraticEq(){
        Scanner sc = new Scanner(System.in);
        double a;
        do {
            System.out.print("Nhập a : ");
            a = sc.nextDouble();
        }
        while (a == 0);
        System.out.print("Nhập b : ");
        double b = sc.nextDouble();
        System.out.print("Nhập c : ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c ;
        double x1 , x2 ;

        if(delta > 0){
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.printf("Phương trình có 2 nghiệm phân biệt : x1 = %f và x2 = %f" , x1 , x2);
        } else if(delta == 0){
            x1 = (-b/(2*a));
            System.out.printf("Phương trình có 1 nghiệm : x1 = x2 = %f" , x1 );
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
