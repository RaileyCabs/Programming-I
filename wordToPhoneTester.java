public class wordToPhoneTester
{
    public static void main(String[] args)
    {
        System.out.println("Test case 1: Test case for all lowercase letters:");
        new wordToPhone("hello");
        System.out.println("Test case 2: Test case for the mix of lowercase and uppercase letters:");
        new wordToPhone("World");
        System.out.println("Test case 3: Test case for digits, and all lowercase letters without dash symbols:");
        new wordToPhone("1800hello");
        System.out.println("Test case 4: Test case for digits, the mix of uppercase and lowercase letters without dash symbols:");
        new wordToPhone("1800Linux");
        System.out.println("Test case 5: Test case for digits, the mix of uppercase and lowercase letters with dash symbols:");
        new wordToPhone("1-800-Windows");
    }
}