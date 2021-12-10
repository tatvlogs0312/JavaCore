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
        Client client = searchClient(list,search);
        if(client == null){
            System.out.println("Không có khách hàng này");
        }else{
            menu();
            System.out.print("Mời lựa chọn : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    list.remove(client);
                    System.out.println("Xóa thành công");
                    break;
                case 2:
                    //Tạo phương thức cập nhật thông tin
                    SetClient setClient = new SetClient();
                    setClient.setClient(list,client);
                    break;
                case 3:
                    System.out.println(client);
                    break;
                default:
                    System.out.println();
            }
        }
    }

    public Client searchClient(ArrayList<Client> list, String id){
        for(Client c : list){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
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

    public static void printlist(ArrayList<Client> list){
        for (Client client : list){
            System.out.println(client);
        }
    }
}
