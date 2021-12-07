package com.company;

import java.util.Scanner;

public class Tester extends Staff{
    private int countErrors;

    public Tester(){
        super();
    }

    public Tester(int id, String name, int phoneNumber, String email, long salary, int countErrors) {
        super(id, name, phoneNumber, email, salary);
        this.countErrors = countErrors;
    }

    public int getCountErrors() {
        return countErrors;
    }

    public void setCountErrors(int countErrors) {
        this.countErrors = countErrors;
    }

    public long salaryTester(){
        return getSalary() + (countErrors * 50000);
    }

    public void insertTester(){
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("Nhập số lỗi phát hiện được : ");
        countErrors = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Tester : " + super.toString() + " - Số lỗi phát hiện được : " + countErrors + " - lương : " + salaryTester() + "\n";
    }
}
