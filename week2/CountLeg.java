package week2.Assignments.Assignment8;

import java.util.Scanner;

public class CountLeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Chickens? ");
        int numberChickens = scanner.nextInt();

        System.out.println("How many Cows? ");
        int numberCows = scanner.nextInt();

        System.out.println("How many Pigs? ");
        int numberPigs = scanner.nextInt();

        chickens(numberChickens);
        cows(numberCows);
        pigs(numberPigs);

        int totalNumberOfLegs = chickens(2)+cows(3)+pigs(5);
        System.out.println(totalNumberOfLegs);
    }
    static int chickens(int numberofChicken){
        int numerOfLegs = numberofChicken * 2;
        return numerOfLegs;
    }

    static int cows(int numberOfCows){
        int numerOfLegs = numberOfCows * 4;
        return numerOfLegs;
    }
    static int pigs(int numberOfPigs){
        int numberOfLegs = numberOfPigs*4;
        return numberOfLegs;
    }

}
