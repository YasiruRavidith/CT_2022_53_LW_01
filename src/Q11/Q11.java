package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name (first middle last): ");
        String[] parts = scanner.nextLine().trim().split("\\s+");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }
}
