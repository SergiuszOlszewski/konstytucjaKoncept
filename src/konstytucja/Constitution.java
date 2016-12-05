package konstytucja;

import java.util.ArrayList;
import java.util.List;

public class Constitution {

     private String title = "KONSTYTUCJA \nRZECZYPOSPOLITEJ POLSKIEJ";
     List<Chapter> chapters = new ArrayList<>();

     public String getTitle(){
          return this.title;
     }
}
