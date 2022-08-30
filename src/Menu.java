import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
        String restaurantName = "Le petite bouche.";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        System.out.println("Todays Menu: " + formatter.format(date));
        System.out.println(restaurantName);
       /* item : cost
         item description
         new line /n/
         repeat   iteration throughout the hashmap */
        System.out.println("Enter one of the following appetizers:");
        System.out.println("1 - Truffle-o Wings");
        System.out.println("2 - Brie en Brioche");
        System.out.println("3 - Homemade Duck Confit Toasted Raviolis");
        System.out.println("4 - Baguette and Charcuterie");

        Scanner scanchoice = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
        int choiceentry = scanchoice.nextInt();
        while (choiceentry != 3) {
            if (choiceentry == 1) {
                System.out.println(MenuItem.wings);
            } else if (choiceentry == 2) {
                System.out.println("Brie en Brioche");
            } else if (choiceentry == 3) {
                System.out.println("Homemade Duck Confit Toasted Raviolis");
            } else if (choiceentry == 4) {
                System.out.println("Baguette and Charcuterie");
            } else {
                System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
                choiceentry = scanchoice.nextInt();

            }

        }
    }

};


