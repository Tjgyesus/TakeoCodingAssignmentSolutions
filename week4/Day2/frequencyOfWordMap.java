package Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyOfWordMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String input = scanner.nextLine();
        String[] wordsSeparated = input.split(" ");
        for (String word : wordsSeparated){



        if (!word.isEmpty()) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }


    }

}
