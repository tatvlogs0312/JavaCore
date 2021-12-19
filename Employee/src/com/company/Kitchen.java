package com.company;

public class Kitchen extends Employee{
    private long serviceCharge;

    public Kitchen(){
        super();
    }

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return super.getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        return "Kitchen{" + super.toString() +
                "Phí dịch vụ : " + serviceCharge + " - " + "Tổng lương : " + calculatorSalary() +
                '}';
    }
}
