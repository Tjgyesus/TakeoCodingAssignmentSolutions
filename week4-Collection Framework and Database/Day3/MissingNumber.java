package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input? ");
        int n = scanner.nextInt();
        int input []= new int[n];
        System.out.println("Enter "+n+" numbers starting from 0");
        for(int i=0; i<n; i++){
            input[i] = scanner.nextInt();
        }
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        int missingNumber=0;

            for (int num : input) {
                arraySum += num;


            }
        missingNumber = totalSum - arraySum;


        System.out.println(missingNumber+" is missing from the array: "+ Arrays.toString(input));

        }


}
