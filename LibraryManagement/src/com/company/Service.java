package com.company;

import java.time.LocalDate;
import java.util.*;

public class Service {
    Scanner sc = new Scanner(System.in);

    public void searchByCategory(ArrayList<Book> list){
        System.out.print("Nhập thể loại cần tìm : ");
        String categories = sc.nextLine();
        System.out.println("Danh sách Book : ");
        list.stream()
                .filter(i -> (Arrays.toString(i.getCategory()).toLowerCase().contains(categories.toLowerCase())))
                .forEach(i -> System.out.println(i));
        long count = list.stream()
                .filter(i -> (Arrays.toString(i.getCategory()).toLowerCase().contains(categories.toLowerCase())))
                .count();
        if (count == 0){
            System.out.println("Không có sách nào");
        }
    }

    public void maxDownload(ArrayList<EBook> listEBook){
        Collections.sort(listEBook, new Comparator<EBook>() {
            @Override
            public int compare(EBook o1, EBook o2) {
                return (int) (o2.getDownloads() - o1.getDownloads());
            }
        });
        System.out.print("Nhập số lượng muốn xem : ");
        int n = sc.nextInt();
        listEBook.stream().limit(n).forEach(i -> System.out.println(i));
    }

    public void searchByYear(ArrayList<Magazine> listMagazine){
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        listMagazine.stream().filter(i -> i.getPublishingDay().getYear()==(year)).forEach(i -> System.out.println(i));
    }
}
