import java.util.Arrays;
import java.util.Scanner;

public class Array667 {
    public static void main(String[] args) {
        int result6 = 0;
        int result7 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter "+n+" number: ");
        for(int i=0; i<n; i++){
            input[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(input));

        for (int i=1; i<n; i++) {
            if (input[i-1]==6 && input[i] == 6){
                result6++;
            }
        }
        System.out.println("66 is repeated "+result6+" times");

        for (int i=1; i<n; i++) {
            if (input[i-1]==6 && input[i] == 7){
                result7++;
            }
        }
        System.out.println("67 is repeated "+result7+" times");
    }
}
