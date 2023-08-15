package Day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

                String s = "Deepak";
                char[] charArray = s.toCharArray();

                Map<Character, Integer> frequencyMap = new HashMap<>();
        System.out.println(s);
                for (char c : charArray) {
                    if (frequencyMap.containsKey(c)) {
                        frequencyMap.put(c, frequencyMap.get(c) + 1);
                    } else {
                        frequencyMap.put(c, 1);
                    }
                }

                System.out.println("Character Frequencies:");
                for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                    System.out.println("'" + entry.getKey() + "': " + entry.getValue());
                }

            }
        }
