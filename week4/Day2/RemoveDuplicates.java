package Day2;

import java.util.*;

public class RemoveDuplicates {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers separated by spaces: ");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            List<Integer> integerList = new ArrayList<>();
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                integerList.add(num);
            }


            Set<Integer> numberSets = new LinkedHashSet<>(integerList);

            System.out.println("Duplicates removed:");
            for (int num : numberSets) {
                System.out.print(num + " ");
            }
        }
    }


