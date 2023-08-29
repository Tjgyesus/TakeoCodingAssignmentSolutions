package week2.Assignments.Assignment8;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String reversed = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char tempString = input.charAt(i);
            reversed = tempString+reversed;
        }
        System.out.println(reversed);
        if (input.equals(reversed)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palidrome");
        }


    }
}




