import java.util.Scanner;
// This class calculate the factorial of an input integer
public class Factorial {
    public static void main(String[] arg) {
        int input;
        // It will be asked for an integer until user give one
        while (true) {
            System.out.println("Please enter an integer: ");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("invalid input!");
            } else {
                input = scanner.nextInt();
                break;
            }
        }
        long output = fact(input);
        System.out.println(output);
    }

    // calculate the factorial recursive
    public static long fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
