// Do not forget to use the 'import' statement.
import java.util.Scanner;

public class AvgSum
{
   private int begin;
   private int end;
    
   public AvgSum()
   {
       Scanner in = new Scanner(System.in);
       boolean validInputs = false;
       while (!validInputs) {
           System.out.println("Please type the starting point (a non-negative integer):");
           begin = in.nextInt();
           System.out.println("Please type the ending point (a non-negative integer and larger than the starting number):");
           end = in.nextInt();
           
           if (begin >= 0 && end > begin && end - begin > 50) {
               validInputs = true;
           } else {
               System.out.println("Please check and make sure that your inputs comply with the rules.");
           }
       }

       this.runAvgSum();
   }
   
   private void runAvgSum()
   {
       int sumOdd = 0;
       int countEven = 0;
       int sumEven = 0;
       
       for (int i = begin; i <= end; i++) {
           if (i % 2 == 0) {
               countEven++;
               sumEven += i;
           } else {
               sumOdd += i;
           }
       }
       
       double avgEven = countEven > 0 ? (double) sumEven / countEven : 0.0;
       
       System.out.printf("The even-avg is %.2f, odd-sum is %d.%n", avgEven, sumOdd);
   }
   
   public static void main(String[] args) {
       AvgSum avgSum = new AvgSum();
   }
}
