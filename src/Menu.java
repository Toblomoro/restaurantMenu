import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {


    static String restaurantName = "Le petite bouche.";

    public static void main(String[] args) {
        /*SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(restaurantName);
        item : cost
         item description
         new line /n/
         repeat   iteration throughout the hashmap */
        System.out.println("Enter one of the following commands:");
        System.out.println("1 - something..");
        System.out.println("2 - something else..");
        System.out.println("3 - exit");
        Scanner scanchoice = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter \"1\", \"2\" or \"3\"");
        int choiceentry = scanchoice.nextInt();
        while (choiceentry != 3) {
     if(choiceentry == 1) {
                System.out.println("Food");
            }
            else if(choiceentry == 2) {
                //..something else
            }
            else if(choiceentry == 3) {
                //...exit program
            }
            else{

                System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
                choiceentry = scanchoice.nextInt();

            }

        }


    }
}
