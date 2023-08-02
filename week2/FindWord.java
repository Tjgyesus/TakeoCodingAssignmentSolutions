package week2.Assignments.Assignment8;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");

        System.out.println("enter the number of the word: ");
        int number = scanner.nextInt();
        System.out.println("the word is: "+stringArray[number-1]);


    }
}
