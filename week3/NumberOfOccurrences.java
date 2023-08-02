package Day1;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        System.out.println("Enter the search: ");
        char ch = scanner.next().charAt(0);
        int count = 0;

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i) == ch)
          {
                count++;
            }

        }
        System.out.println("Repeated: "+count);
    }
}
