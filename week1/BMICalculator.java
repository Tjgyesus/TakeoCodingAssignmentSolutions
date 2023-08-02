package Assignment5;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height (m): ");
        double height = scanner.nextDouble();

        double BMI =  weight/(height*height);

        System.out.println("BMI is "+(BMI));


    }
}
