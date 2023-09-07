package Day1;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum range");
        int minRange = scanner.nextInt();
        System.out.println("Enter the maximum range");
        int maxRange = scanner.nextInt();
        int num = minRange+ (int)((maxRange-minRange)*Math.random());
        System.out.println(num);
        System.out.println("Guess a number between "+minRange+" and "+maxRange);
        System.out.println("You have 5 attempts");
        for (int i=5; i>=1;i--) {
            int guess = scanner.nextInt();
            if (guess >= minRange && guess <= maxRange) {

                if (num == guess) {
                    System.out.println("🎉Congratulations🎉! You guessed correct");
                    break;
                } else if (guess > num && i != 1) {
                    System.out.println("Too high! Guess lower number! "+(i-1)+" attempts remaining");
                } else if (guess < num && i != 1) {
                    System.out.println("Too low!, Guess higher number "+(i-1)+" attempts remaining");
                } else if (i == 1) {
                    System.out.println("Game Over!");
                }

            } else {
                System.out.println("Please follow the rules 😡 👇👇👇");
                System.out.println("Guess a number between "+minRange+" and "+maxRange);
                i++;


            }
        }




    }

}
