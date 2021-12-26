package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Repository {
    public ArrayList<SGK> getSGK(){
        ArrayList<SGK> listSGK = new ArrayList<>();
        listSGK.add(new SGK(1,"Làm chủ lập trình", new String[]{"Khoa học, Lập trình "},"a" ,"Kim Đồng",2021,50,20));
        listSGK.add(new SGK(2,"Làm chủ Toán", new String[]{"Khoa học, logic"},"b" ,"Kim Đồng",2021,50,21));
        listSGK.add(new SGK(3,"Văn học Việt Nam", new String[]{"Văn học , Nghệ thuật"},"c" ,"Kim Đồng",2021,50,22));
        listSGK.add(new SGK(4,"Tiếng Anh", new String[]{"Ngoại ngữ"},"d" ,"Kim Đồng",2021,50,23));
        listSGK.add(new SGK(5,"Lịch sử", new String[]{"Lịch sử , Văn học"},"e" ,"Kim Đồng",2021,50,24));
        return listSGK;
    }

    public ArrayList<Magazine> getMagazine(){
        ArrayList<Magazine> listMagazine = new ArrayList<>();
        listMagazine.add(new Magazine(1,"Hoa học trò",new String[]{"Học sinh"},"Kim Đồng", LocalDate.of(2020,12,2),20,50));
        listMagazine.add(new Magazine(2,"Hôn nhân và gia đình",new String[]{"Hôn nhân , Gia đình"},"Báo mới", LocalDate.of(2021,12,2),25,51));
        listMagazine.add(new Magazine(3,"Pháp luật và đời sống",new String[]{"Pháp luật"},"Kim Đồng", LocalDate.of(2019,12,2),30,52));
        listMagazine.add(new Magazine(4,"Báo giao thông",new String[]{"Pháp luật"},"Kim Đồng", LocalDate.of(2021,12,2),35,53));
        listMagazine.add(new Magazine(5,"Tin nóng",new String[]{"Pháp luật"},"Báo mới", LocalDate.of(2021,12,2),40,54));

        return listMagazine;
    }

    public ArrayList<EBook> getEBook(){
        ArrayList<EBook> listEBook = new ArrayList<>();
        listEBook.add(new EBook(1,"Học html",new String[]{"Lập trình"},"a",2020,LocalDate.of(2021,10,2),3,25000));
        listEBook.add(new EBook(2,"Học css",new String[]{"Lập trình"},"b",2020,LocalDate.of(2021,1,5),5,23543));
        listEBook.add(new EBook(3,"Học js",new String[]{"Lập trình"},"c",2020,LocalDate.of(2021,11,20),2.5,12354));
        listEBook.add(new EBook(4,"Học java core",new String[]{"Lập trình"},"d",2020,LocalDate.of(2021,8,12),3.1,9871));
        listEBook.add(new EBook(5,"Học database",new String[]{"Lập trình"},"e",2020,LocalDate.of(2021,9,22),2.3,13452));
        listEBook.add(new EBook(6,"Học string boost",new String[]{"Lập trình"},"f",2020,LocalDate.of(2021,7,2),31.3,125));
        listEBook.add(new EBook(7,"Học devops",new String[]{"Lập trình"},"g",2020,LocalDate.of(2021,1,30),23,252));

        return listEBook;
    }
}
