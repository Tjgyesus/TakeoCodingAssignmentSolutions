package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayAndTarget {
    public static void main(String[] args) {
        int[] nums = {11,15, 2,8,7, 11, 15};
        int target = 9;

        int[] sumToMakeTarget = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sumToMakeTarget = new int[]{i, j};
                }


            }
        }
        System.out.println(Arrays.toString(sumToMakeTarget));

    }


}
