import java.util.Scanner;

public class MakesTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int int1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int int2= scanner.nextInt();
        int sum = int1+int2;
        boolean result = false;

        if(int1==10 || int2==10 || sum==10){
            result = true;
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }
    }
}
