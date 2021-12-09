import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        ArrayList<Client> list = data.getData();

        Service s = new Service();

        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.print("Nhập lựa chọn của bạn : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Danh sách khách hàng : ");
                    printlist(list);
                    break;
                case 2:
                    s.printByGender(list);
                    break;
                case 3:
                    System.out.println("Nhập thông tin khách hàng : ");
                    list.add(s.insertClient());
                    break;
                case 4:
                    System.out.print("Nhập ID muốn tìm : ");
                    String search = sc.nextLine();
                    s.searchByID(list,search);
                    break;
                default:
                    isCheck = true;
                    System.out.println("\n--Kết thúc chương trình !--");
                    System.exit(1);
            }
        }
    }

    public static void printlist(ArrayList<Client> list){
        for (Client client : list){
            System.out.println(client);
        }
    }

    public static void menu(){
        System.out.println("1 - In thông tin khách hàng");
        System.out.println("2 - In thông tin khách hàng theo giới tính");
        System.out.println("3 - Thêm khách hàng vào danh sách");
        System.out.println("4 - Tìm khách hàng theo ID");
        System.out.println("--Nhập bất kì để thoát");
    }
}
