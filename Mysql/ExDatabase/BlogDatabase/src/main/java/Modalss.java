import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Modalss {
   private int id;
   private String title,content,description,thumnail;
   private LocalDate create_at;

    @Override
    public String toString() {
        return "Modalss{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + description + '\'' +
                ", tag='" + thumnail + '\'' +
                ", create_at=" + create_at +
                '}';
    }
}
