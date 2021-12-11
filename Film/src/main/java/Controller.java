import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Film> list;
    Scanner sc;

    public Controller(){
        service = new Service();
        list = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.print("Nhập lựa chọn : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Danh sách film : ");
                    service.printlist(list);
                    break;
                case 2:
                    service.sortByName(list);
                    break;
                case 3:
                    service.sortByLength(list);
                    break;
                case 4:
                    service.sortByView(list);
                    break;
                default:
                    System.out.println("--Thoát chương trình--");
                    isCheck = true;
            }
        }
    }

    public static void menu(){
        System.out.println("1 - Đọc danh sách");
        System.out.println("2 - Sắp xếp danh sách theo tên");
        System.out.println("3 - Sắp xếp danh sách theo thời lượng");
        System.out.println("4 - Sắp xếp danh sách theo lượt xem");
        System.out.println("---Nhập bất kì để thoát---");
    }
}
