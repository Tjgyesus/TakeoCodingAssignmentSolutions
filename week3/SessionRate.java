import java.util.Scanner;

public class SessionRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 rates of the session: ");
        int firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt();

        if((firstNumber>=5 && secondNumber>=5) && ((firstNumber >= secondNumber * 2) || (secondNumber >= 2 * firstNumber))){
                System.out.println("2");
            }
        else if(firstNumber<5 || secondNumber<5)
            {
                System.out.println("0");
            }
        else{
            System.out.println("1");
        }
        }

    }

