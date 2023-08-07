package Day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = {5,6,7,8};
        int reversedArray;

        System.out.println("given array: "+ Arrays.toString(numberArray));

        System.out.print("Reversed array: ");

        for(int i =numberArray.length-1; i>=0; i--){
            reversedArray = numberArray[i];
            System.out.print(reversedArray);

        }

        }
    }


