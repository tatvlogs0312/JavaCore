import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SetClient {
    public void setClient(ArrayList<Client> list, Client client) {
        Scanner sc = new Scanner(System.in);
        menuSetClient();
        System.out.print("Nhập lựa chọn sửa đổi : ");
        int choiceSetClient = sc.nextInt();
        sc.nextLine();
        switch (choiceSetClient) {
            case 1:
                System.out.print("Nhập tên muốn sửa : ");
                String newName = sc.nextLine();
                client.setName(newName);
                System.out.println(client);
                break;
            case 2:
                System.out.print("Nhập số điện thoại muốn sửa : ");
                String newMobile = sc.nextLine();
                client.setMobile(newMobile);
                System.out.println(client);
                break;
            case 3:
                System.out.print("Nhập email muốn sửa : ");
                String newEmail = sc.nextLine();
                client.setEmail(newEmail);
                System.out.println(client);
                break;
            case 4:
                System.out.print("Nhập quê quán muốn sửa : ");
                String newAddress = sc.nextLine();
                client.setAddress(newAddress);
                System.out.println(client);
                break;
            case 5:
                Gender newGender;
                System.out.print("(1:nam - 0:nữ) Nhập giới tính muốn sửa : ");
                int g = sc.nextInt();
                if (g == 1) {
                    newGender = Gender.Man;
                } else {
                    newGender = Gender.Woman;
                }
                client.setGender(newGender);
                System.out.println(client);
                break;
            case 6:
                System.out.print("Nhập ngày sinh muốn sửa : ");
                int newDay = sc.nextInt();
                System.out.print("Nhập tháng sinh muốn sửa : ");
                int newMonth = sc.nextInt();
                System.out.print("Nhập năm sinh muốn sửa : ");
                int newYear = sc.nextInt();
                LocalDate newDate = LocalDate.of(newYear, newMonth, newDay);
                client.setDate(newDate);
                System.out.println(client);
                break;
            default:
                System.out.println("Kết thúc sửa chữa !");
        }
    }

    public static void menuSetClient() {
        System.out.println("1 - Thay đổi tên khách hàng");
        System.out.println("2 - Thay đổi SĐT khách hàng");
        System.out.println("3 - Thay đổi email khách hàng");
        System.out.println("4 - Thay đổi quê quán khách hàng");
        System.out.println("5 - Thay đổi giới tính khách hàng");
        System.out.println("6 - Thay đổi ngày tháng năm sinh khách hàng");
        System.out.println("--nhập bất kì để thoát--");
    }
}
