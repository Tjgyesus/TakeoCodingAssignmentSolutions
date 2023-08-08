package week2.Assignments.Assignment8;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ATMdenomination {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to withdraw: ");
        int input = scanner.nextInt();
        int[] notes = {2000, 500, 200, 100};
        int[] counter= new int[4];


        if (input >= 100 && input % 5 == 0) {
            for (int i = 0; i < notes.length; i++) {
                if (input >= notes[i]) {
                    {
                        counter[i] = input / notes[i];
                        input = input % notes[i];
                    }
                }
            }
        } else {
            System.out.println("Enter valid amount");
        }
        System.out.println("Currency Count: ");
        for(int i=0; i<notes.length; i++){
            if(counter[i] != 0){
                System.out.println(notes[i]+": "+counter[i]);
            }
        }
    }
}





