import java.util.HashMap;

public class AppMenu {


    public static HashMap<String, String> appMethod() {
        HashMap<String, String> appItems = new HashMap<String, String>();
        appItems.put("Truffle-o Wings", " $12.99");
        appItems.put("Brie en Brioche", " $14.99");
        appItems.put("Homemade Duck Confit Toasted Raviolis", " $19.99");
        appItems.put("Baguette and Charcuterie", " $12.99");
        /*appList = (Arrays.toString(appItems.entrySet().toArray()));
   System.out.println("Appetizer pairings are " + appList);*/
       System.out.println("\nToday's appetizer selection is:");
      appItems.forEach((key, value) -> System.out.println(key + ":" + value));

        return null;
    }



}

