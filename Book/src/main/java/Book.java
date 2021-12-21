import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Book {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String name;
    @SerializedName("author")
    private String author;
    @SerializedName("category")
    private String[] category;
    @SerializedName("publishingYear")
    private int publishingYear;
    @SerializedName("publishingCompany")
    private String publishingCompany;
    @SerializedName("pageNumber")
    private int pageNumber;

    @Override
    public String toString() {
        return "Book{" +
                "id = '" + id + '\'' +
                ", tên = '" + name + '\'' +
                ", tác giả = '" + author + '\'' +
                ", thể loại = " + Arrays.toString(category) +
                ", năm phát hành = " + publishingYear +
                ", nhà phát hành = " + publishingCompany +
                ", số trang = " + pageNumber +
                '}';
    }
}


