import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service{

    public ArrayList<Book> getData() {
        ArrayList<Book> listBook = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("Book.json");
            Type objType = new TypeToken<ArrayList<Book>>(){}.getType();
            listBook = gson.fromJson(reader,objType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return listBook;
    }

    public void printList(ArrayList<Book> listBook) {
        for (Book book : listBook){
            System.out.println(book);
        }
    }

    public void sortByPublishingYear(ArrayList<Book> listBook) {
        Collections.sort(listBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingYear() - o2.getPublishingYear();
            }
        });
        System.out.println("Danh sách book theo năm phát hành");
        printList(listBook);
    }

    public void filterByCategory(ArrayList<Book> listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thể loại sách muốn tìm : ");
        int count = 0;
        String category = "";
        category = sc.nextLine();
        System.out.println("Danh sách book : ");
        for (Book book : listBook){
            for (int i = 0 ; i < book.getCategory().length ; i++){
                if (book.getCategory()[i].toLowerCase().contains(category.toLowerCase())){
                    System.out.println(book);
                    count++;
                }
            }
        }
        if (count == 0){
            System.out.println("Không có sách nào");
        }
    }

    public Map<String, Integer> countByCategory(ArrayList<Book> listBook) {
        Map<String, Integer> map = new HashMap<>();

        for (Book book : listBook){
            for (int i = 0 ; i < book.getCategory().length ; i++){
                if (map.get(book.getCategory()[i]) == null){
                    map.put(book.getCategory()[i],1 );
                } else {
                    map.put(book.getCategory()[i],map.get(book.getCategory()[i]) + 1);
                }
            }
        }
        return map;
    }

    public void searchByName(ArrayList<Book> listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách muốn tìm : ");
        int count = 0;
        String name = "";
        name = sc.nextLine();
        System.out.println("Danh sách book : ");
        for (Book book : listBook) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }
        if (count == 0){
            System.out.println("không tìm thấy sách");
        }
    }
}
