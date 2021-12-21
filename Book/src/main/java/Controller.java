import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Book> listBook;
    Scanner sc;

    public Controller() {
        service = new Service();
        listBook = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = checkChoice();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách tất cả sách trong thư viện : ");
                    service.printList(listBook);
                    break;
                case 2:
                    service.filterByCategory(listBook);
                    break;
                case 3:
                    Map<String, Integer> countCategory = service.countByCategory(listBook);
                    System.out.println("Số lượng sách mỗi thể loại : ");
                    for (Map.Entry<String, Integer> entry : countCategory.entrySet()) {
                        System.out.println("Thể loại : " + entry.getKey() + " : " + entry.getValue() + " quyển");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách book theo năm phát hành");
                    service.sortByPublishingYear(listBook);
                    break;
                case 5:
                    service.searchByName(listBook);
                    break;
                default:
                    System.out.println("Kết thúc chương trình");
                    isCheck = true;
                    System.exit(1);
            }
        }
    }

    public static void menu() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("1 - Danh sách Book");
        System.out.println("2 - Tìm sách theo thể loại");
        System.out.println("3 - Đếm sách theo thể loại");
        System.out.println("4 - Sắp xếp sách theo năm phát hành");
        System.out.println("5 - Tìm sách theo tên");
        System.out.println("--Nhập số bất kì để thoát--");
    }

    public static int checkChoice(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean isCheck = false;
        while (!isCheck)
        {
            try {
                System.out.print("Nhập lựa chọn của bạn : ");
                choice = Integer.parseInt(sc.nextLine());
                isCheck = true;
            } catch (NumberFormatException e){
                System.out.println("Nhập không hợp lệ , vui lòng nhập lại !!");
            }
        }
        return choice;
    }
}
