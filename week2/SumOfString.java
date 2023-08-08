package week2.Assignments.Assignment6;

import java.util.Scanner;

public class SumOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your array? ");
        int lengz = scanner.nextInt();
        int[] a = new int[lengz];
        int sum=0;

        for(int i=0; i<a.length; i++){
            System.out.println("Enter index of :"+i);
            a[i]= scanner.nextInt();
            sum = sum+a[i];
        }
        for (int j=0; j<a.length; j++) {
            System.out.print("Index [" + j + "] = " + a[j] + ", ");
        }

        System.out.println("The sum of all the entered values is: "+sum);


    }



    }

