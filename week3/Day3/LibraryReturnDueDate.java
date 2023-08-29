package Day1;

import java.util.Scanner;

public class LibraryReturnDueDate {
    public static void main(String[] args) {
        int fine = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the return date separated by space : dd mm yyyy: ");
        int returnDay = scanner.nextInt(),returnMonth = scanner.nextInt(),returnYear = scanner.nextInt();

        System.out.println("Enter the due date: ");
        int dueDay = scanner.nextInt(), dueMonth = scanner.nextInt(),dueYear = scanner.nextInt() ;
        
        if (returnYear<=dueYear) {
            if(returnMonth<=dueMonth){
                if(returnDay<=dueDay){
                    fine = 0;
                }
                else{
                    fine = 15*(returnDay-dueDay);
                }
            }
            else {
                fine = 500 * (returnMonth-dueMonth);
            }
        }
        else {
            fine = 1000;
        }

        System.out.println("fine: "+fine);





    }
}
