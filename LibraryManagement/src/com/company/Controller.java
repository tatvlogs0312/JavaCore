package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public void controller(){
        Repository repository = new Repository();
        ArrayList<SGK> listSGK = repository.getSGK();
        ArrayList<Magazine> listMagazine = repository.getMagazine();
        ArrayList<EBook> listEBook = repository.getEBook();
        ArrayList<Book> list = new ArrayList<>();
        list.addAll(listSGK);
        list.addAll(listMagazine);
        list.addAll(listEBook);

        Service service = new Service();
        boolean isCheck = false;
        while (!isCheck){
            mainMenu();
            int choice1 = check();
            switch (choice1){
                case 1:
                    menu();
                    int choice2 = check();
                    switch (choice2){
                        case 1:
                            printListSGK(listSGK);
                            break;
                        case 2:
                            printListMagazine(listMagazine);
                            break;
                        case 3:
                            printListEBook(listEBook);
                            break;
                        default:
                            System.out.println("Kết thúc xem !!!");
                    }
                    break;
                case 2:
                    service.searchByCategory(list);
                    break;
                case 3:
                    service.maxDownload(listEBook);
                    break;
                case 4:
                    service.searchByYear(listMagazine);
                    break;
                default:
                    System.out.println("Kết thúc chương trình");
                    isCheck = true;
            }
        }

    }

    public static void printListSGK(ArrayList<SGK> listSGK){
        listSGK.stream().forEach(i -> System.out.println(i));
    }

    public static void printListMagazine(ArrayList<Magazine> listMagazine){
        listMagazine.stream().forEach(i -> System.out.println(i));
    }

    public static void printListEBook(ArrayList<EBook> listEBook){
        listEBook.stream().forEach(i -> System.out.println(i));
    }

    public static void printList(ArrayList<Book> list){
        list.stream().forEach(i -> System.out.println(i));
    }

    public static void mainMenu(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("1 - In thông tin sách theo từng loại");
        System.out.println("2 - In thông tin sách theo thể loại");
        System.out.println("3 - In thông tin ebook được tải về nhiều nhất");
        System.out.println("4 - In thông tin tạp chí xuất bản năm nay");
        System.out.println("---Nhập bất kì để thoát---");
    }

    public static void menu(){
        System.out.println("1 - Sách giáo khoa");
        System.out.println("2 - Tạp chí");
        System.out.println("3 - EBook");
        System.out.println("--Nhập bất kì để không xem nữa--");
    }

    public static int check(){
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
