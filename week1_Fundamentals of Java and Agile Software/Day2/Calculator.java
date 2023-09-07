package Assignment3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        double result;
        char operator;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter Operator: +,-,*,/ ");
        operator = scan.next().charAt(0);

        if (operator == '+'){

            result = num1+num2;
            System.out.println("Addition of "+num1+" and "+num2+" is = "+result);
        }

        else if (operator == '-'){

            result = num1-num2;
            System.out.println("Subtraction of "+num1+" and "+num2+" is = "+result);
        }

        else if (operator == '*'){

            result = num1*num2;
            System.out.println("Multiplication of "+num1+" and "+num2+" is = "+result);
        }

        else if (operator == '/'){

            result = num1/num2;
            System.out.println("Division of "+num1+" and "+num2+" is = "+result);
        }
        else{
            System.out.println("Error");
        }


    }


}
