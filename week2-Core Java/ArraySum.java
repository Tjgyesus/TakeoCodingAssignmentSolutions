package week2.Assignments.Assignment6;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number? ");
        int count = scanner.nextInt();
        int[] input = new int[count];
        System.out.println("Enter the numbers: ");
        for (int x=0; x<count; x++){
            input[x] = scanner.nextInt();
        }

        int sum = 0;
        double avg=0;
        for (int i=0; i<input.length; i++){
            sum = sum + input[i];
        }
        avg = sum/input.length;

        System.out.println("Sum and Avg are:"+sum+" "+avg);




    }
}
