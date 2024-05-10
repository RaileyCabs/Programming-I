public class MathElementsTester 
{
    public static void main(String[] args) {
        MathElements math = new MathElements(); // Creating an instance of MathElements

        System.out.println(math.PI); // Accessing PI through the instance

        double r = 15.6;

        System.out.println("The circle area is " + math.circleArea(r)); // Accessing circleArea through the instance
    }
}
