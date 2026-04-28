package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        char middleInitial = middleName.charAt(0);
        System.out.println(firstName + " " + middleInitial + ". " + lastName);
    }
}
