import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);

    //thêm khách hàng
    public Client insertClient(){
        Gender gender;

        System.out.print("Nhập ID : ");
        String id = sc.nextLine();
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        int day = sc.nextInt();
        System.out.print("Nhập tháng sinh : ");
        int month = sc.nextInt();
        System.out.print("Nhập năm sinh : ");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        sc.nextLine();
        System.out.print("Nhập quên quán : ");
        String address = sc.nextLine();
        System.out.print("(1:nam - 0:nữ) Nhập giới tính : ");
        int g = Integer.parseInt(sc.nextLine()) ;
        if (g == 1){
            gender = Gender.Man;
        } else {
            gender = Gender.Woman;
        }
        System.out.print("Nhập số điện thoại : ");
        String mobile = sc.nextLine();
        System.out.print("Nhập email : ");
        String email = sc.nextLine();

        return new Client(id,name,date,gender,address,mobile,email);
    }

    //tìm kiếm theo id
    public void searchByID(ArrayList<Client> list, String search){
        int count = 0;
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId().toLowerCase().contains(search.toLowerCase())){
                count++;
                menu();
                System.out.print("Mời lựa chọn : ");
                int choice = sc.nextInt();
                boolean isCheck = false;
                sc.nextLine();
                while (!isCheck){
                    switch (choice) {
                        case 1 -> {
                            list.remove(i);
                            System.out.println("Đã xóa thông tin");
                        }
                        case 2 -> {
                            System.out.println("Sửa thông tin khách hàng : ");
                            setClient();
                            System.out.print("Nhập lựa chọn sửa đổi : ");
                            int choiceSetClient = sc.nextInt();
                            sc.nextLine();
                            boolean isCheck2 = false;
                            while (!isCheck2) {
                                switch (choiceSetClient) {
                                    case 1 -> {
                                        System.out.print("Nhập tên muốn sửa : ");
                                        String newName = sc.nextLine();
                                        list.get(i).setName(newName);
                                        System.out.println(list.get(i));
                                    }
                                    case 2 -> {
                                        System.out.print("Nhập số điện thoại muốn sửa : ");
                                        String newMobile = sc.nextLine();
                                        list.get(i).setMobile(newMobile);
                                        System.out.println(list.get(i));
                                    }
                                    case 3 -> {
                                        System.out.print("Nhập email muốn sửa : ");
                                        String newEmail = sc.nextLine();
                                        list.get(i).setEmail(newEmail);
                                        System.out.println(list.get(i));
                                    }
                                    case 4 -> {
                                        System.out.print("Nhập quê quán muốn sửa : ");
                                        String newAddress = sc.nextLine();
                                        list.get(i).setAddress(newAddress);
                                        System.out.println(list.get(i));
                                    }
                                    case 5 -> {
                                        Gender newGender;
                                        System.out.print("(1:nam - 0:nữ) Nhập giới tính muốn sửa : ");
                                        int g = Integer.parseInt(sc.nextLine());
                                        if (g == 1) {
                                            newGender = Gender.Man;
                                        } else {
                                            newGender = Gender.Woman;
                                        }
                                        list.get(i).setGender(newGender);
                                        System.out.println(list.get(i));
                                    }
                                    case 6 -> {
                                        System.out.print("Nhập ngày sinh muốn sửa : ");
                                        int newDay = sc.nextInt();
                                        System.out.print("Nhập tháng sinh muốn sửa : ");
                                        int newMonth = sc.nextInt();
                                        System.out.print("Nhập năm sinh muốn sửa : ");
                                        int newYear = sc.nextInt();
                                        LocalDate newDate = LocalDate.of(newYear, newMonth, newDay);
                                        list.get(i).setDate(newDate);
                                        System.out.println(list.get(i));
                                    }
                                    default -> {
                                        System.out.println("Kết thúc sửa chữa !");
                                        isCheck2 = true;
                                    }
                                }
                            }
                        }
                        case 3 -> System.out.println(list.get(i));
                        default -> {
                            System.out.println("Thoát tìm kiếm ! ");
                            isCheck = true;
                        }
                    }
                }
            }
            if (count == 0){
                System.out.println("Không tìm thấy khách hàng");
            }
        }
    }

    //in theo giới tính
    public void printByGender(ArrayList<Client> list){
        Gender gender;
        System.out.print("(1:nam - 0:nữ) Nhập giới tính : ");
        int g = Integer.parseInt(sc.nextLine()) ;
        if (g == 1){
            gender = Gender.Man;
        } else {
            gender = Gender.Woman;
        }

        System.out.println("Danh sách khách hàng theo giới tính : ");
        for (Client client : list) {
            if (client.getGender().equals(gender)) {
                System.out.println(client);
            }
        }
    }

    public static void menu() {
        System.out.println("1 - Xóa thông tin khách hàng");
        System.out.println("2 - Sửa thông tin khách hàng");
        System.out.println("3 - Hiện thị thông tin khách hàng");
        System.out.println("--nhập bất kì để thoát--");
    }

    public static void setClient(){
        System.out.println("1 - Thay đổi tên khách hàng");
        System.out.println("2 - Thay đổi SĐT khách hàng");
        System.out.println("3 - Thay đổi email khách hàng");
        System.out.println("4 - Thay đổi quê quán khách hàng");
        System.out.println("5 - Thay đổi giới tính khách hàng");
        System.out.println("6 - Thay đổi ngày tháng năm sinh khách hàng");
        System.out.println("--nhập bất kì để thoát--");
    }

    public static void printlist(ArrayList<Client> list){
        for (Client client : list){
            System.out.println(client);
        }
    }
}
