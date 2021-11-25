package com.company;

public class Main {

    public static void main(String[] args) {
	    double a , b ;
        a = 5;
        b = 10;
        Calculator c = new Calculator();
        c.display(a,b);

        bmi1();

        System.out.println("BMI = " + bmi2());

        double  weight , height ;
        weight = 70 ;
        height = 1.75;
        System.out.println("BMI = " + bmi3(weight,height));
    }

    public static void bmi1(){
        double  weight , height ;
        weight = 70 ;
        height = 1.75;
        double bmi1 = weight/Math.pow(height,2);
        System.out.println("BMI = " + bmi1);
    }

    public static double bmi2(){
        double  weight , height ;
        weight = 70 ;
        height = 1.75;
        return weight/Math.pow(height,2);
    }

    public static double bmi3(double  weight , double height){
        return weight/Math.pow(height,2);
    }
}
