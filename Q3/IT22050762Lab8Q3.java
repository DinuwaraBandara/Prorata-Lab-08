
import java.util.Scanner;

public class IT22050762Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        // Input 6 positive numbers
        for (int i = 0; i < 6; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            int number = input.nextInt();

            // Validate the number
            while (number <= 0) {
                System.out.println("Invalid input! Enter a positive number.");

                System.out.print("Enter number " + (i + 1) + ": ");
                number = input.nextInt();
            }

            numbers[i] = number;
        }

        // Find maximum number
        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}
