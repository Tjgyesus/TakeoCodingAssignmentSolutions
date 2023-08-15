package Day2;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumTargetOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input? ");
        int n = scanner.nextInt();
        int nums []= new int[n];
        System.out.println("Enter the "+n+" numbers");
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        int[] sumToMakeTarget = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sumToMakeTarget = new int[]{nums[i], nums[j]};
                }

            }
        } System.out.println("The numbers that make "+target+" are "+Arrays.toString(sumToMakeTarget));
    }


}



