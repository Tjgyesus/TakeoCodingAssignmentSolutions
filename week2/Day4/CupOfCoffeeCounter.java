package week2.Assignments.Assignment9;

import java.util.Scanner;

public class CupOfCoffeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Cups did you buy? ");
        int coffeeBought = scanner.nextInt();
        int coffeeGot = coffeeBought + coffeeBought/6;

        System.out.println("you got "+coffeeGot+" cups of coffee");
    }
}
