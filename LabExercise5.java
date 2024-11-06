
package labexercise5;

import java.util.Scanner;

public class LabExercise5 {

    
    public static void main(String[] args) {
        
        
   Scanner scanner = new Scanner(System.in);

        // Question 1: Personal Information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Favorite Kpop Group?: ");
        String fav = scanner.nextLine();
        System.out.print("Who is your bias?: ");
        String tw = scanner.nextLine();
        System.out.print("Favorite song of your group?: ");
        String likey = scanner.nextLine();
        System.out.print("How many members of your group?: ");
        String mm = scanner.nextLine();
        System.out.print("Name a non korean member?: ");
        String jp = scanner.nextLine();
        System.out.print("What the name of the fandom?: ");
        String once = scanner.nextLine();
        System.out.print("Second favorite group?: ");
        String ive = scanner.nextLine();
        System.out.print("Favorite song?: ");
        String song = scanner.nextLine();
        System.out.print("Who is your bias?: ");
        String bias = scanner.nextLine();
        
        System.out.println("        ");
        System.out.println("Results");
         System.out.println("Name:" +name);
         System.out.println("Favorite Kpop Group:" +fav);
         System.out.println("Bias:" +tw);
         System.out.println("Favorite Song:" +likey);
         System.out.println("Members:" +mm);
         System.out.println("The non Korean Member:" +jp);
         System.out.println("Fandom:" +once);
         System.out.println("Second Favorite Group:" +ive);
         System.out.println("Favorite Song:" +song);
         System.out.println("Bias:" +bias);
    }
    
}
