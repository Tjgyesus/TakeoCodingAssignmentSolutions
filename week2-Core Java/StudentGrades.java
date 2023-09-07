package week2.Assignments.Assignment6;

import java.util.Scanner;
import java.util.SortedMap;

public class StudentGrades {
    static int[] grade = new int[5];
    static String[] subject = new String[5];

    static int sum = 0;
    static double avg = 0;
    static char gradeLetter;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the subject: ");
            subject[i] = scanner.next();
            System.out.println("Enter the marks for: " + subject[i].toUpperCase());
            grade[i] = scanner.nextInt();
            sum = sum + grade[i];
        }

        getAverage(sum);
        System.out.println("Average of the marks is: " + avg);
        getGradeLetter(getAverage(sum));
        isPassing(getAverage(sum));


//


    }

    static double getAverage(int sum) {
       avg = sum / 5;
        return avg;
    }

    static char getGradeLetter(double avg) {
        if (avg >= 90) {
            gradeLetter = 'A';
            System.out.println("The Grade is: " + gradeLetter);
        } else if (avg >= 80 && avg < 90) {
            gradeLetter = 'B';
            System.out.println("The Grade is: " + gradeLetter);
        } else if (avg >= 70 && avg < 80) {
            gradeLetter = 'C';
            System.out.println("The Grade is: " + gradeLetter);
        } else if (avg >= 60 && avg < 70) {
            gradeLetter = 'D';
            System.out.println("The Grade is: " + gradeLetter);
        } else if (avg < 60) {
            gradeLetter = 'E';
            System.out.println("The Grade is: " + gradeLetter);
        }
        return gradeLetter;
    }

    static void isPassing(double avg){
        if(avg>60){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}







