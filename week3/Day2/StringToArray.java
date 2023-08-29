package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();


        System.out.println(Arrays.toString(input.split(" ")));

    }
}
