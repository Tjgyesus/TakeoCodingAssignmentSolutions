package Day1;

import java.util.Scanner;

public class enterValueOneOrTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int input = scanner.nextInt();
        while(input!=1 && input!=2){
            System.out.print("Try Again! ");
            input = scanner.nextInt();
        }
    }
}
