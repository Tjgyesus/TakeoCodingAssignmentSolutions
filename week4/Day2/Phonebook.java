package Day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebookMap = new HashMap<>();

        while (true) {
            System.out.println("Phonebook Menu:");
            System.out.println("1. Add entry");
            System.out.println("2. Search for entry");
            System.out.println("3. Remove entry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebookMap.put(name, phoneNumber);
                    System.out.println(name+" added to the phonebook.");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (phonebookMap.containsKey(searchName)) {
                        String foundNumber = phonebookMap.get(searchName);
                        System.out.println("Phone number for " + searchName + ": " + foundNumber);
                    } else {
                        System.out.println(searchName+" not found in the phonebook.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    if (phonebookMap.containsKey(removeName)) {
                        phonebookMap.remove(removeName);
                        System.out.println(removeName+" removed from the phonebook.");
                    } else {
                        System.out.println(removeName+" not found in the phonebook.");
                    }
                    break;
                case 4:
                    System.out.println("Exit phonebook...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
