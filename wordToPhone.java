public class wordToPhone 
{
    //"letterNumberInput"
    private String letterNumberInput = "";
    private String letterNumberConverted = "";

    public wordToPhone(String letterNumberInput) 
    {
        this.letterNumberInput = letterNumberInput;
        displayLetterNumberInput();
        converter();
    }

    public void converter() {
        StringBuilder convertedNumber = new StringBuilder();
        boolean lastWasDash = false; 
        for (char c : letterNumberInput.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                if (c >= 'A' && c <= 'C') {
                    convertedNumber.append('2');
                } else if (c >= 'D' && c <= 'F') {
                    convertedNumber.append('3');
                } else if (c >= 'G' && c <= 'I') {
                    convertedNumber.append('4');
                } else if (c >= 'J' && c <= 'L') {
                    convertedNumber.append('5');
                } else if (c >= 'M' && c <= 'O') {
                    convertedNumber.append('6');
                } else if (c >= 'P' && c <= 'S') {
                    convertedNumber.append('7');
                } else if (c >= 'T' && c <= 'V') {
                    convertedNumber.append('8');
                } else if (c >= 'W' && c <= 'Z') {
                    convertedNumber.append('9');
                }
                lastWasDash = false; 
            } else if (Character.isDigit(c)) {
                convertedNumber.append(c);
                lastWasDash = false; 
            } else if (c == '-') {
                
                if (convertedNumber.length() > 0 && !lastWasDash) {
                    convertedNumber.append('-');
                    lastWasDash = true;
                }
            }
        }
        letterNumberConverted = convertedNumber.toString();
        displayLetterNumberConverted();
    }

    public void displayLetterNumberInput() {
        System.out.println("The input number is: " + letterNumberInput);
    }

    public void displayLetterNumberConverted() {
        System.out.println("The converted number is: " + letterNumberConverted);
    }

    public static void main(String[] args) {
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
