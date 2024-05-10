// Do not forget to use the 'import' statement.
import java.util.Scanner;

public class Fib
{
    private int n;

    public Fib()
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please type the starting point (a non-negative integer):");
            n = scanner.nextInt();
            if (n > 2) {
                break;
            } else {
                System.out.println("Please type an integer greater than 2.");
            }
        }

        this.runFib();
    }

    public void runFib()
    {
        int a = 0, b = 1;
        System.out.print("First " + n + " terms of Fibonacci series are: ");
        System.out.print(a + ", " + b); // print first two terms
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next); // print the next term
            a = b;
            b = next;
        }
        System.out.println(); // newline after printing all terms
    }
}
