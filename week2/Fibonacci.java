package week2.Assignments.Assignment8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fibonnaci series to display? ");
        int n = scanner.nextInt();

        int  firstNum =0, secondNum=1;

        for(int i=1; i<=n; i++){
            System.out.print(firstNum+", ");
            int nextNum = firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
        System.out.println("...");



    }
}
