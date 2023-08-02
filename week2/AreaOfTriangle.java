package week2.Assignments.Assignment9;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height: ");
        int height = scanner.nextInt();

      double triArea = (base*height/2);
        System.out.println("Triangle Area is : "+triArea);
    }
}
