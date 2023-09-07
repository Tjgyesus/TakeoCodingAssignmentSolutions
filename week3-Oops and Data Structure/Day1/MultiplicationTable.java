package Day1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number you want to multiply: ");
        int n = scanner1.nextInt();
        System.out.println("How many times do you want to multiply the number "+n);
        int timesRange = scanner1.nextInt();

        for(int i=1; i<=timesRange; i++){
            int result = n*i;
            System.out.println(n+" * "+" "+i+" = "+result);
        }

    }
}
