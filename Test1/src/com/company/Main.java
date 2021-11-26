package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        //bài 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài : ");
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 0 ; i < m ; i++ ){
            for (int j = 0 ; j < m ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0 ; i < m ; i++ ){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        //bài 2
        String n = "You only live once, but if you do it right, once is enough";
        String word[] = n.split("\\s");
        int index = 0;
        for (String w : word){
            index++;
        }
        System.out.println("Số từ trong chuỗi : " + index);

        char kyTu = 'o';

        for (int i = 0 ; i < n.length() ; i++){
            if(n.charAt(i) == kyTu){
                System.out.println("Vị trí : " + i);
            }
        }

        //bài 3
        Random ran = new Random();
        int a = ran.nextInt();
        System.out.println("Số ngẫu nhiên : " + a);

        if(isPrimeNumber(a)){
            System.out.printf("%d là số nguyên tố" , a);
        } else {
            System.out.printf("%d không phải số nguyên tố" , a);
        }

        //bài 4
        int b = 0;
        int count = 0;
        System.out.print("\n10 số nguyên tố đầu tiên : ");
        while(count < 10){
            if(isPrimeNumber(b)){
                System.out.print(b + "\t");
                count++;
            }
            b++;
        }

        System.out.println("\nSố nguyên tố nhỏ hơn 10 : ");
        for(int i = 0 ; i < 10 ; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //bài 5
        System.out.print("Nhập chuỗi : ");
        String str = sc.nextLine();
        System.out.println("Chuỗi sau khi chuẩn hóa : " + ChuanHoa(str));

        if(Check(str)){
            System.out.println("Chuỗi là chuỗi palindrome");
        } else {
            System.out.println("Chuỗi không phải là chuỗi palindrome");
        }

        //bài 6
        System.out.print("Nhập số hàng và cột của ma trận : ");
        int row = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[row][row];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print("Nhập phần tử : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Đường chéo chính : ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < row ; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String ChuanHoa(String name){
        name = name.trim();
        String word[] = name.split("\\s+");
        String kq = "";
        for(int i = 0 ; i < word.length ; i++){
            kq += String.valueOf(word[i].charAt(0)).toUpperCase() + word[i].substring(1).toLowerCase() + " ";
        }
        return kq;
    }

    public static boolean Check(String name){
        String str = "" ;
        for (int i = name.length() - 1 ; i >= 0 ; i--){
            str += name.charAt(i);
        }
        if(!name.equals(str)){
            return false;
        }
        return true;
    }
}
