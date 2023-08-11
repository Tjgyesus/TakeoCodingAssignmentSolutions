import java.util.Arrays;

public class NumberDuplicate {
    public static void main(String[] args) {
        int[] numberArray = {1,1,2,2,3,4,5};
        int n = numberArray.length;
         int[] duplicate= {};
        System.out.print("Duplicate: ");
            for (int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(numberArray[i]==numberArray[j]) {
                        duplicate = new int[]{numberArray[j]};
                        System.out.print(Arrays.toString(duplicate)+"\t");
                    }

                }
                }



    }
    }

