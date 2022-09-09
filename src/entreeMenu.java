import java.util.HashMap;

public class entreeMenu {
    public static HashMap<String, String> entreeMethod() {
        HashMap<String, String> appItems = new HashMap<String, String>();

        appItems.put("Coq au Vin \n-A slow braised chicken quarter in red wine with champangion", " $22.99");
        appItems.put("Lobster Tail Braised in Butter \n-It is butter and fresh lobster what more could you ask for?", " $34.99");
        appItems.put("Bone in Rib-eye \n-Bourbon marinated an grilled to your liking.", " $29.99");
        appItems.put("Spinach and Cherry Tomato Tart \n-Roasted tomatoes and farm fresh goat cheese win a airy puffpastry with garlic sauteed spinach.", " $22.99");
        /*appList = (Arrays.toString(appItems.entrySet().toArray()));
   System.out.println("Appetizer pairings are " + appList);*/


        return appItems;
    }

}
