import java.util.ArrayList;

public interface IService {
    public ArrayList<Film> getData();

    public void printlist(ArrayList<Film> list);
    public void sortByName(ArrayList<Film> list);
    public void sortByLength(ArrayList<Film> list);
    public void sortByView(ArrayList<Film> list);
}
