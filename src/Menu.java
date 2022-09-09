import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class Menu  {


    public static void main(String[] args) {
       String restaurantName = "Le petite bouche.";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date updatedDate = LastModified.modifiedAt();
        System.out.println("Menu last updated at : " + formatter.format(updatedDate));

        System.out.println("Todays Menu: " + formatter.format(date));

        System.out.println(restaurantName);
       /* item : cost
         item description
         new line /n/
         repeat   iteration throughout the hashmap */

        System.out.println("\nToday's appetizer selection is:");
        AppMenu.appMethod().forEach((key, value) -> System.out.println(key + ":" + value));
        /*System.out.println("Enter one of the following appetizers:");
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
                System.out.println( "Truffle-o Wings");
                break;
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

        }*/
        System.out.println("\nToday's entree selection is:");
        entreeMenu.entreeMethod().forEach((key, value) -> System.out.println(key + ":" + value));



        System.out.println("\nToday's dessert selection is:");
        dessertMenu.dessertMethod().forEach((key, value) -> System.out.println(key + ":" + value));

    }

};


