
import java.util.Scanner;

public class IT22050762Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Enter 8 student IDs
        for (int i = 0; i < 8; i++) {

            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int studentID = input.nextInt();

            // Validate student ID
            while (studentID <= 0) {
                System.out.println("Invalid Student ID!");

                System.out.print("Enter Student ID " + (i + 1) + ": ");
                studentID = input.nextInt();
            }

            studentsArray[i] = studentID;
        }

        // Search for a student ID
        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}
