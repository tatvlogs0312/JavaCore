package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm : ");
        int n = sc.nextInt();

        Person person[] = new Person[n];
        for (int i = 0 ; i < n ; i++){
            person[i] = new Person();
            person[i].input();
        }

        for (int i = 0 ; i < n ; i++){
            System.out.println(person[i]);
        }

        sc.nextLine();//chả hiểu sao trôi lệnh :((

        //tìm kiếm theo tên sản phẩm
        System.out.print("Nhập tên của sản phẩm muốn tìm kiếm : ");
        String findName = sc.nextLine();

        int count = 0;
        for (int i = 0 ; i < n ; i++){
            if(person[i].name.equals(findName)){
                System.out.println(person[i]);
                count++;
            }
        }
        if(count == 0){
            System.out.printf("không tìm thấy sản phẩm có tên : %s", findName);
        }
    }
}
