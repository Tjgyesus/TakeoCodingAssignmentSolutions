import java.util.Scanner;

public class FirstMultipleOfSecondInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if(secondNumber%firstNumber==0){
            System.out.println("Yes "+firstNumber+" is "+" multiple of "+secondNumber);
        }
        else {
            System.out.println("No, "+firstNumber+" is not multiple of "+secondNumber);
        }


    }
}
