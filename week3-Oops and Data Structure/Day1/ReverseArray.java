package Day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = scanner.nextInt();
        int[] numberArray = new int[n];
        System.out.println("Enter the numbers separated by space: ");
        for(int i=0; i<n; i++){
            numberArray[i] = scanner.nextInt();
        }

        int reversedArray;
        System.out.println("given array: "+ Arrays.toString(numberArray));

        System.out.print("Reversed array: [");

        for(int i =numberArray.length-1; i>=0; i--){
            reversedArray = numberArray[i];
            System.out.print(reversedArray);

        }
        System.out.println("]");

        }
    }


