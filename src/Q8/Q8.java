package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with one '!': ");
        String input = scanner.nextLine();

        int markIndex = input.indexOf('!');
        String before = input.substring(0, markIndex).trim();
        String after = input.substring(markIndex + 1).trim();

        System.out.println(before);
        System.out.println(after);
    }
}
