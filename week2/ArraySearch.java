package week2.Assignments.Assignment6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number? ");
        int count = scanner.nextInt();
        int[] input = new int[count];
        System.out.println("Enter the numbers: ");
        for (int x=0; x<count; x++){
            input[x] = scanner.nextInt();
        }

        System.out.println("Enter the number you looking for: ");
        int search = scanner.nextInt();
        for (int i=0; i<input.length; i++){
            if(search == input[i]){
                System.out.println(input[i]+" is in index: "+i);
            }

        }
    }
}
