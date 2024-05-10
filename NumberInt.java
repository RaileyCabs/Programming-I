
// Do not forget to use the 'import' statement.
import java.util.Scanner;

public class NumberInt
{
    private int x;

    // Constructor that asks the user to type an integer and save the value to 'x'
    public NumberInt()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // Your code to accept user input
        x = in.nextInt();// Complete the statement.
        
        // Pay attention to the use of 'this' key word here.
        this.CheckTheInput();
    }


    public void CheckTheInput()
    {
        // Plese finish your code that gives the output based on user input.
        // Hints:
        // System.out.println("It's a negative number.");
        // System.out.println("It's a zero.");
        // System.out.println("It's a positive number.");
        
        if (x < 0) {
            System.out.println("It's a negative number.");
        } else if (x == 0) {
            System.out.println("It's zero.");
        } else {
            System.out.println("It's a positive number.");
        }
    }
}