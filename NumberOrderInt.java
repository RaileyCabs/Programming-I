import java.util.Scanner;

public class NumberOrderInt
{
    
    private int a;
    private int b;
    private int c;

    
    public NumberOrderInt()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        // Finish your code that accepts three integer inputs from the user,
        // and store them in 'a', 'b', and 'c', respectively.
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        //
        this.compareOrder();
    }

 
    public void compareOrder() {
          // Plese finish your code that gives the output based on user input.
          // Hints:
          // System.out.println("in order");
          // System.out.println("in order");
          // System.out.println("not in order");
        if ((a < b && b < c) || (a > b && b > c)) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }
    }
}