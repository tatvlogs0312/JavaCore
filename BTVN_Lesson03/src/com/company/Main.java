package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất có dạng : ax + b = 0");
        Simple s = new Simple();
        s.simpleEq();

        System.out.println("Phương trình bậc 2 có dạng : ax2 + bx + c = 0");
        Quadratic q = new Quadratic();
        q.QuadraticEq();

        System.out.println("Các số nguyên tố nhỏ hơn 20");
        for(int i = 0 ; i < 20 ; i++) {
            if (Prime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

        public static boolean Prime(int n){
        if(n < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2 ; i <= squareRoot ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
