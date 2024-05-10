// Do not forget to use the 'import' statements.
import java.util.Scanner;
import java.util.ArrayList;

public class MinMaxAvgArray
{
   private int n = -1;
   private ArrayList<Integer> IntegerList = new ArrayList<Integer>();
   private boolean RepeatRequired = true;
   private int min = 0;
   private int max = 0;
   private double avg = 0.0;
   
   // 
   // 
   public MinMaxAvgArray()
   {
       Scanner in = new Scanner(System.in);
       
       do
       {
          System.out.println("Please type a positive integer #"+ (IntegerList.size()+1));
          n = in.nextInt();
          
          if (n > 0) {
              IntegerList.add(n);
          } else {
              RepeatRequired = false;
          }

       }while(RepeatRequired);
       
       if (IntegerList.size() < 3) {
           System.out.println("Please type at least 3 positive integers before a non-positive number to terminate the input process.");
           IntegerList.clear();
           new MinMaxAvgArray(); // Restart the process
       } else {
           this.acceptNumberInput();
       }
   }
   
   // 
   // 
   public void acceptNumberInput()
   {
       System.out.println("Input numbers: " + IntegerList);
       int sum = 0;
       min = IntegerList.get(0);
       max = IntegerList.get(0);
       
       for (int num : IntegerList) {
           if (num < min) {
               min = num;
           }
           if (num > max) {
               max = num;
           }
           sum += num;
       }
       
       avg = (double) sum / IntegerList.size();
       
       System.out.println("Minimum: " + min);
       System.out.println("Maximum: " + max);
       System.out.printf("Average: %.2f\n", avg);
   }

}
