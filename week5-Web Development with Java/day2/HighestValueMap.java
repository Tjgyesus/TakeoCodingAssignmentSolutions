package day2;

import java.util.HashMap;
import java.util.Map;

public class HighestValueMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 33);
        map.put("D", 40);
        map.put("E", 10);
        map.put("F", 60);

        int max = 0;
        String keyWithMaxValue = null;
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                keyWithMaxValue = entry.getKey();
            }
        }
        System.out.println(keyWithMaxValue);
    }

}
