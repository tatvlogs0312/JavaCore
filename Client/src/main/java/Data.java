import java.time.LocalDate;
import java.util.ArrayList;

public class Data {
    public ArrayList<Client> getData(){
        ArrayList<Client> list = new ArrayList<>();
        list.add(new Client("1","Tuấn", LocalDate.of(2002,12, 3),Gender.Man,"Hà Nội","0384551953","tanhtuan093@gmail.com"));
        list.add(new Client("2","Thảo",LocalDate.of(1998,10,30),Gender.Woman,"Nam Định","0331234567","thao@gmail.com"));
        list.add(new Client("3","Hiếu",LocalDate.of(2002,4,4),Gender.Man,"Hà Nội","037654321","hieu@gmail.com"));
        return list;
    }
}
