package com.company;

import java.util.Scanner;

public class Staff {
    private int id;
    private String name;
    private int phoneNumber;
    private String email;
    private long salary;

    public Staff(){

    }

    public Staff(int id, String name, int phoneNumber, String email, long salary) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập id : ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên : ");
        name = sc.nextLine();
        System.out.print("Nhập số điện thoại : ");
        phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập email : ");
        email = sc.nextLine();
        System.out.print("Nhập lương cơ bản : ");
        salary = Long.parseLong(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Id : " + id + " - Name : " + name + " - Số điện thoại : " + phoneNumber
                + " - Email : " + email + " - Lương cơ bản : " + salary ;
    }
}
