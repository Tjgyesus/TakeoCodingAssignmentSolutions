import java.util.Scanner;

public class TwoAsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers separated by space: ");
        int firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt(),
        thirdNumber = scanner.nextInt();

        int sumOfFirstnSecond = firstNumber + secondNumber;

        if(sumOfFirstnSecond == thirdNumber){
            System.out.println("True! The sum of "+firstNumber+" and "+secondNumber+" is "+sumOfFirstnSecond);
        }
        else {
            System.out.println("False! The sum of "+firstNumber+" and "
                    +secondNumber+" is "+sumOfFirstnSecond+" not "+thirdNumber);
        }

    }
}
