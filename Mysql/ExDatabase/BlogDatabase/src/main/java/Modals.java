import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Modals {
private int  id;
 private String   title;
    private String   content;
    private String        description;
    private String   thumnail;
   private int id_category;
    private int  id_author;
   private String         create_at;
    private String   status;

    public Modals(int id, String title, String content, String description, String thumnail, String create_at) {
    }


    @Override
    public String toString() {
        return  id +
                "-" + title +
                "-'" + content +
                "-'" + description +
                "-'" + thumnail +
                "-" + id_category +
                "-" + id_author +
                "-" + create_at +
                "-" + status ;
    }

}
