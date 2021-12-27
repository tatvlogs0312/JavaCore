package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    Scanner sc = new Scanner(System.in);

    //kiểm tra username đã tồn tại chưa
    public String checkUsername(ArrayList<User> list) {
        String username = "";
        boolean isCheck = false;
        while (!isCheck) {
            System.out.print("Nhập username : ");
            username = sc.nextLine();
            int count = 0;
            for (User user : list) {
                if (user.getUsername().equals(username)) {
                    count++;
                    isCheck = true;
                }
            }
            if (count == 0) {
                System.out.println(username + " không tồn tại , vui lòng nhập lại !");
            }
        }
        return username;
    }

    //kiểm tra username có đúng password không
    public User checkUser(ArrayList<User> list, String username, String password) {
        for (User user : list) {
            if (user.getUsername().equals(username) && (user.getPassword().equals(password))) {
                return user;
            }
        }
        return null;
    }

    //thiết lập username đúng định dạng
    public String setUsername(ArrayList<User> list){
        String username = "";
        boolean isCheck = false;
        while (!isCheck){
            try {
                System.out.print("Nhập tên : ");
                username = sc.nextLine();
                if (username.isEmpty()) throw new NullPointerException("Bạn chưa nhập gì");
                for (User user : list){
                    if (user.getUsername().equals(username)) throw new MyException("Username đã tồn tại !");
                }
                isCheck = true;
            } catch (NullPointerException e){
                System.out.println(e.getMessage() + ", Vui lòng nhập lại");
            } catch (MyException e){
                System.out.println(e.getMessage() + ", Vui lòng nhập lại");
            }
        }
        return username;
    }

    //thiết lập email đúng định dạng
    public String setEmail(ArrayList<User> list){
        String email = "";
        boolean isCheck = false;
        while (!isCheck) {
            try {
                System.out.print("Nhập email : ");
                email = sc.nextLine();
                if (!emailValidator(email)) throw new MyException("Email không đúng định dạng");
                for (User user : list){
                    if (user.getEmail().equals(email)) throw new MyException("Email đã tồn tại !");
                }
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", Vui lòng nhâp lại");
            }
        }
        return email;
    }

    public static boolean emailValidator(String email) {
        String EMAIL_REGIX = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(EMAIL_REGIX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //thiết lập password đúng định dạng
    public String setPassword(ArrayList<User> list){
        String password = "";
        boolean isCheck = false;
        while (!isCheck){
            try {
                System.out.print("Nhập password : ");
                password = sc.nextLine();
                if (!passwordValidator(password)) throw new MyException("Password không đúng định dạng !");
                isCheck = true;
            } catch (MyException e){
                System.out.println(e.getMessage() + " , Vui lòng nhâp lại");
            }
        }
        return password;
    }

    public static boolean passwordValidator(String password){
        String PASSWORD_REGIX = "^(?=.*[A-Z])(?=.*[@#_+=,./~$!%*?&])[A-Za-z0-9@#_+=,./~$!%*?&]{7,15}$";
        Pattern pattern = Pattern.compile(PASSWORD_REGIX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    //kiểm tra lựa chọn có đúng định dạng ko
    public int checkChoice(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean isCheck = false;
        while (!isCheck){
            try {
                System.out.print("Nhập lựa chọn : ");
                choice = Integer.parseInt(sc.nextLine());
                isCheck = true;
            } catch (NumberFormatException e){
                System.out.println("Nhập không hợp lệ, vui lòng nhập lại !!");
            }
        }
        return choice;
    }
}
