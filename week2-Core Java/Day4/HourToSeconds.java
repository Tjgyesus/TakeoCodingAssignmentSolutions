package TakeoCodingAssignments.tj.week2.Assignments.Assignment9;

import java.util.Scanner;

public class HourToSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hour = scanner.nextInt();
        int seconds = hour*3600;
        System.out.println(hour+" hours is "+seconds+" seconds");


    }
}
