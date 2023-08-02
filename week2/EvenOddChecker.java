package week2.Assignments.Assignment6;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int count = scanner.nextInt();
        int[] number = new int[count];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            number[i] = scanner.nextInt();
        }

        checkEvenOdd(number);


    }


    static void checkEvenOdd(int number[]) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i] + " is Even");
            }
            else {
           System.out.println(number[i] + " is Odd");
            }

        }


    }
}

