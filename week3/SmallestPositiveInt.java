import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositiveInt {
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

//        int[] array = {-2,0,3,4,9,0,-1,90,99};

        int smallestInt=0;
        for (int i=0; i<array.length; i++) {
            if (array[i] > 0) {
                smallestInt = array[i];
                break;
            }
        }

            for (int i=0; i<array.length; i++){
                if(array[i]>0 && array[i]<smallestInt){
                    smallestInt=array[i];
                }
            }
        System.out.println("Smallest Positive Integer is: "+smallestInt);
        }

    }
