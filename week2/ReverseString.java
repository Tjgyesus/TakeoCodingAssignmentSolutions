package week2.Assignments.Assignment7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            reversed = temp+reversed;


        }
        System.out.println(reversed);
    }
}
