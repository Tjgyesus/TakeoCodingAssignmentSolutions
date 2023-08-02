package week2.Assignments.Assignment6;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        int count = 0;
        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels is: "+count);
    }
}
