package com.company;

public class Waiter extends Employee{
    private long compensate;

    public Waiter() {
        super();
    }

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }


    @Override
    public long calculatorSalary() {
        return super.getBasicSalary() + compensate;
    }

    @Override
    public String toString() {
        return "Waiter{" + super.toString() +
                "Tip : " + compensate + " - " +  "Tổng lương : " + calculatorSalary() +
                '}';
    }
}
