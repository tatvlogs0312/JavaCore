import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService{
    @Override
    public ArrayList<Film> getData() {
        ArrayList<Film> list = new ArrayList<>();
        Gson gson = new Gson();

        try{
            FileReader reader = new FileReader("film.json");

            Type objectType = new TypeToken<ArrayList<Film>>(){}.getType();

            list = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }

        return list;
    }


    @Override
    public void sortByName(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
//                String word1[] = o1.getName().replace("[-+.^:,]","").split("\\s+");
//                String word2[] = o2.getName().replace("[-+.^:,]","").split("\\s+");
//                return word1[0].compareTo(word2[0]);
                return o1.getName().replace(":,.\\s+","").compareTo(o2.getName().replace(":,.\\s+",""));
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên film ");
        printlist(list);
    }

    @Override
    public void sortByLength(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getLength() - o2.getLength();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo thời lượng film ");
        printlist(list);
    }

    @Override
    public void sortByView(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getView() - o2.getView();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo lượt xem");
        printlist(list);
    }

    @Override
    public void printlist(ArrayList<Film> list) {
        for (Film film : list){
            System.out.println(film);
        }
    }
}
