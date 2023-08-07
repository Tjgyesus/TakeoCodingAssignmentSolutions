package Day1;

import java.util.Arrays;

public class numberNegPos {
    public static void main(String[] args) {
        int[] arr = {10,20,-30,44,55,0,-50};

        System.out.println(Arrays.toString(arr));

        int negCount = 0;
        int posCount = 0;
        int zeros = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]<0){
                negCount++;
            }
            else {
                posCount++;
            }
        }
        System.out.println("Negative Numbers: "+negCount);
        System.out.println("Positive Numbers: "+posCount);
        System.out.println("Zeros Numbers: "+zeros);


    }
}
