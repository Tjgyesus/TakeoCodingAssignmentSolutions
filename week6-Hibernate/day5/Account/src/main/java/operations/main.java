package operations;

import entity.Account;

import java.util.Scanner;

import static operations.App.app;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Account ID: ");
        int inputId = scanner.nextInt();
       Account account = new Account();

        app(inputId);




    }
}
