package com.company;

import java.util.Scanner;

public class Deverloper extends Staff{
    private int overtime;

    public Deverloper(){
        super();
    }


    public Deverloper(int id, String name, int phoneNumber, String email, long salary, int overtime) {
        super(id, name, phoneNumber, email, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public long salaryDev(){
        return getSalary() + ( overtime * 200000 ) ;
    }

    public void insertDev(){
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("Nhập số giờ overtime : ");
        overtime = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Dev : " + super.toString() + " - Số giờ overtime : " + overtime + " - lương : " + salaryDev() + "\n";
    }
}
