package week2.Assignments.Assignment6;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many records? ");
        int count = scanner.nextInt();
        int[] temp = new int[count];
        System.out.println("Enter the temperatures: ");
        for (int x=0; x<count; x++){
            temp[x] = scanner.nextInt();
        }

        findMaxTemp(temp);
        findMinTemp(temp);
        findAverageTemp(temp);

    }

    static int findMaxTemp(int temp[]) {
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println("Maximum Temperature is: " + max);
        return max;
    }

    static int findMinTemp(int temp[]) {
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        System.out.println("Minimum Temperature is: " + min);
        return min;
    }

    static double findAverageTemp(int temp[]){
        double avg = 0;
        int sum= 0;
        for (int i=0; i<temp.length; i++){
            sum = sum+temp[i];
            avg = sum/temp.length;

        }
        System.out.println("Average Temperature is: "+avg);
        return avg;

    }


    }



