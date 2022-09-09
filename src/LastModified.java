import java.io.File;
import java.util.Date;
public class LastModified {


    public static Date modifiedAt() {
        String filePath = "C://Users//brdwa//Desktop//Launch Code Unit 2//restaurantMenu2//src";
        //Creating the File object
        File file = new File(filePath);
        //Getting the last modified time
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);

        return date;
    }
}
