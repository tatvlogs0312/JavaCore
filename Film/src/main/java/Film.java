import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Film {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("category")
    private String category;

    @SerializedName("director")
    private String director;

    @SerializedName("lenght")
    private int length;

    @SerializedName("premiereTime")
    private String premiereTime;

    @SerializedName("view")
    private int view;

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", premiereTime=" + premiereTime +
                ", view=" + view +
                '}';
    }
}
