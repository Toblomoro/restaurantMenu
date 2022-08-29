import java.util.HashMap;
import java.util.*;

public class MenuItem {
    private static String appList;
    String item;
    String description;
    Double cost;

    public static void main(String[] args) {
        HashMap<String, Double> appItems = new HashMap<String, Double>();


        appItems.put("Truffle-o Wings", 12.99);
        appItems.put("Brie en Brioche", 14.99);
        appItems.put("HomemadeDuck Confit Toasted Raviolis", 19.99);
        appItems.put("Baguette and Charcuterie", 12.99);
        /*appList = (Arrays.toString(appItems.entrySet().toArray()));
   System.out.println("Appetizer pairings are " + appList);*/
    }
}
