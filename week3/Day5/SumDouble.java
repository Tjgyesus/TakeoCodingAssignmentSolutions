import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int int1= scanner.nextInt();
        System.out.println("Enter the second number: ");
        int int2= scanner.nextInt();
        int sum = int1+int2;
        if(int1==int2){
            sum=sum*2;
            System.out.println("The same number: double sum = "+ sum);
        }
        else {
            System.out.println("Not the same numbers: sum = "+sum
            );
        }
    }
}
