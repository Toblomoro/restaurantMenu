import java.util.HashMap;

public class entreeMenu {
    public static HashMap<String, String> entreeMethod() {
        HashMap<String, String> appItems = new HashMap<String, String>();

        appItems.put("Coq au Vin", " $22.99");
        appItems.put("Lobster Tail Braised in Butter", " $34.99");
        appItems.put("Bone in Rib-eye", " $29.99");
        appItems.put("Spinach and Cherry Tomato Tart", " $22.99");
        /*appList = (Arrays.toString(appItems.entrySet().toArray()));
   System.out.println("Appetizer pairings are " + appList);*/


        return appItems;
    }

}
