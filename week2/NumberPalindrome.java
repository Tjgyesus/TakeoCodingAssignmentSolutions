package week2.Assignments.Assignment8;

import java.util.Scanner;

public class NumberPalindrome {
        public static void main(String[] args) {
            int reverse = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            int temp = num;

            while (temp !=0){
                int digit = temp%10;
                reverse = reverse*10+digit;
                temp/=10;

            }
            System.out.println(reverse);
            if(reverse == num){
                System.out.println("It is a Palindrome number");
            }
            else {
                System.out.println("Not a Palidrome");
            }


        }
    }

