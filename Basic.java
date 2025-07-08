import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Taking input from the user
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your roll number: ");
            String rollNo = scanner.nextLine();

            System.out.print("Enter your branch: ");
            String branch = scanner.nextLine();

            System.out.print("Enter your section: ");
            String section = scanner.nextLine();

            // Displaying the entered details
            System.out.println("\n----- Student Details -----");
            System.out.println("Name       : " + name);
            System.out.println("Roll No    : " + rollNo);
            System.out.println("Branch     : " + branch);
            System.out.println("Section    : " + section);
        }
    }
}
