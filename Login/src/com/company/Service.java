package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    Check check = new Check();

    public void Login(ArrayList<User> list){
        String username = check.checkUsername(list);
        System.out.print("Nhập Password : ");
        String password = sc.nextLine();

        User user = check.checkUser(list,username,password);
        if (user == null){
            //password sai
            changePassword(list,username);
        } else {
            //password đúng
            System.out.println("Đăng nhập thành công");
            boolean isCheck = false;
            while (!isCheck){
                MenuLoginSuccess();
                int choice = check.checkChoice();
                switch (choice){
                    case 1:
                        String username1 = check.setUsername(list);
                        user.setUsername(username1);
                        System.out.println("Thay đổi username thành công !");
                        break;
                    case 2:
                        String email1 = check.setEmail(list);
                        user.setEmail(email1);
                        System.out.println("Thay đổi email thành công !");
                        break;
                    case 3:
                        String password1 = check.setPassword(list);
                        user.setPassword(password1);
                        System.out.println("Thay đổi password thành công !");
                        break;
                    case 4:
                        System.out.println("Đăng xuất thành công !");
                        isCheck = true;
                        break;
                    case 0:
                        System.out.println("Kết thúc chương trình");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("không có lựa chọn này !!!");
                }
            }
        }
    }

    //thay đổi password
    public void changePassword(ArrayList<User> list , String username){
        System.out.println("Password sai !");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        boolean isCheck = false;
        while (!isCheck){
            int choice = check.checkChoice();
            switch (choice){
                case 1:
                    Login(list);
                    isCheck = true;
                    break;
                case 2:
                    System.out.print("Nhập email để đổi password : ");
                    String email = sc.nextLine();
                    int count = 0;
                    for (User user1 : list){
                        if (user1.getUsername().equals(username) && user1.getEmail().equals(email)) {
                            String password1 = check.setPassword(list);
                            user1.setPassword(password1);
                            count++;
                        }
                    }
                    if (count == 0){
                        System.out.println("Email không tồn tại");
                    } else {
                        System.out.println("Thay đổi password thành công !");
                    }
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    //thêm 1 user
    public User Register(ArrayList<User> list){
        String username = check.setUsername(list);
        String email = check.setEmail(list);
        String password = check.setPassword(list);
        User user = new User(username,email,password);
        return user;
    }

    public static void MenuLoginSuccess(){
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
    }

}
