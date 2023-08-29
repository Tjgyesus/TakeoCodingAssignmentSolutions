import java.util.Arrays;
import java.util.Scanner;

public class MaxOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many numbers: ");
        int n= scanner.nextInt();
        int[] array= new int[n];
        System.out.println("Enter "+n+" number to the array: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int max=0;
        for (int i=0; i<n; i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        System.out.println("Max number in the given array is: "+max);


    }
}
