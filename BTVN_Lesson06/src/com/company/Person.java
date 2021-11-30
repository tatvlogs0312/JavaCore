package com.company;

import java.util.Scanner;

public class Person {
    public String id;//mã sản phẩm
    public String name;//tên sản phẩm
    public String description;//mô tả
    public int quantity;//số lượng
    public double price;//giá bán
    public String type;//loại

    Person(){

    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm : ");
        id = sc.nextLine();

        System.out.print("Nhập tên sản phẩm : ");
        name = sc.nextLine();

        System.out.print("Nhập mô tả của sản phẩm : ");
        description = sc.nextLine();

        System.out.print("Nhập số lượng sản phẩm : ");
        quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giá bán của sản phẩm : ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập loại của sản phẩm : ");
        type = sc.nextLine();

        System.out.println();
    }

    @Override
    public String toString(){
        return "Mã sản phẩm : " + id + "\n"
                + "Tên sản phẩm : " + name + "\n"
                + "Mô tả : " + description + "\n"
                + "Số lượng : " + quantity + "\n"
                + "Giá bán : " + price + "\n"
                + "Loại : " + type + "\n";
    }

}

