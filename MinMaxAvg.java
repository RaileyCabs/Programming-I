// Do not forget to use the 'import' statement.
import java.util.Scanner;

public class MinMaxAvg
{
   private int n;
   private int min;
   private int max;
   private double avg;
   private Scanner scanner;
   
   // Constructor that accepts the user input n (count of numbers to type)
   // Ask the user to Retype if n is not in the [5,8] range.
   public MinMaxAvg()
   {
       scanner = new Scanner(System.in);
       System.out.println("Please type the number of integers to input (between 5 and 8, inclusive):");
       while (true) {
           n = scanner.nextInt();
           if (n >= 5 && n <= 8) {
               break;
           } else {
               System.out.println("Invalid input! Please enter a number between 5 and 8.");
           }
       }
       acceptNumberInput();
   }
   
   // Accept user input and update the values for min, max, and avg.
   // Ask the user to REDO if input not in range
   public void acceptNumberInput()
   {
       int sum = 0;
       min = Integer.MAX_VALUE;
       max = Integer.MIN_VALUE;
       System.out.println("Please enter " + n + " integers between 1 and 1000:");
       for (int i = 0; i < n; i++) {
           int num;
           while (true) {
               num = scanner.nextInt();
               if (num >= 1 && num <= 1000) {
                   break;
               } else {
                   System.out.println("Invalid input! Please enter a number between 1 and 1000.");
               }
           }
           sum += num;
           if (num < min) {
               min = num;
           }
           if (num > max) {
               max = num;
           }
       }
       avg = (double) sum / n;
       System.out.printf("Minimum: %d%n", min);
       System.out.printf("Maximum: %d%n", max);
       System.out.printf("Average: %.2f%n", avg);
   }
   
   // Main method for testing the class
   public static void main(String[] args) {
       MinMaxAvg minMaxAvg = new MinMaxAvg();
   }
}
