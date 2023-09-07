package Assignment4;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scan.nextInt();
        scan.close();


        if (age>=1 && age<=13){
           System.out.println("You are Child");

        }
        else if (age>=14 && age<=30){
                System.out.println("You are young");

        }
        else if (age>=31 && age <=50){
            System.out.println("You are Middle");

        }
        else if (age>=51 && age <=100){
            System.out.println("You are Old");

        }
        else {
            System.out.println("Enter valid age");

        }


    }
}
