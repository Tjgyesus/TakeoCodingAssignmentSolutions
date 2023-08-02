package week2.Assignments.Assignment7;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you need a factorial for: ");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i=1; i<=number; i++){
            factorial = factorial*i;
        }
        System.out.println("The Factorial of "+number+" is: "+factorial);

    }
}
