import java.util.Arrays;
import java.util.Scanner;

public class SameFirstLast {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter "+n+" number: ");
        for(int i=0; i<n; i++){
            input[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(input));

        if(input[0]==input[n-1]){
            System.out.println(result);
        }
        else {
            result=false;
            System.out.println(result);
        }
    }
}
