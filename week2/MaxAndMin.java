package week2.Assignments.Assignment7;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] numbers = {1,9,5,7,8};
        int max=0;
        int min = numbers[0];


        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            else if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
