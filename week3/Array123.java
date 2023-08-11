import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

    public class Array123 {
        public static void main(String[] args) {
            int result =0;
            boolean b = false;

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many numbers: ");
            int n = scanner.nextInt();
            int[] input = new int[n];
            System.out.println("Enter "+n+" number: ");
            for(int i=0; i<n; i++){
                input[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(input));

            for (int i=2; i<n; i++) {
                if (input[i-2]==1 && input[i-1] == 2 && input[i]==3){
                    result++;
                    b=true;

                }

            }

            if(result>0){
                System.out.println(b+", 123 has occured "+result+" times in the array");
            }
            else {
                System.out.println(b+" ");

            }


        }
    }




