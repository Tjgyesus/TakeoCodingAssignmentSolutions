package Assignment5;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principalAmount = scan.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rateOfInterest = scan.nextDouble();

        System.out.println("Enter the time period in years: ");
        double timePeriod = scan.nextDouble();

        double simpleIntrest = (principalAmount*rateOfInterest*timePeriod)/100;

        System.out.println("The Simple Interest of "+principalAmount+" with interest rate "+rateOfInterest+" in "+timePeriod+" years is: ");
        System.out.println(simpleIntrest);


    }
}
