import java.util.HashMap;

public class dessertMenu {
    public static HashMap<String, String> dessertMethod() {
        HashMap<String, String> appItems = new HashMap<String, String>();

        appItems.put("Tiramisu", " $12.99");
        appItems.put("Cranberry Torte", " $14.99");
        appItems.put("New York Style Cheesecake", " $19.99");
        appItems.put("Souffle du omlette", " $12.99");
        /*appList = (Arrays.toString(appItems.entrySet().toArray()));
   System.out.println("Appetizer pairings are " + appList);*/


        return appItems;
    }
}
