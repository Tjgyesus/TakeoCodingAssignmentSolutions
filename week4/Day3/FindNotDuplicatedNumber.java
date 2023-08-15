package Day3;

import java.util.HashMap;
import java.util.Map;

public class FindNotDuplicatedNumber {
    public static void main(String[] args) {

        int[] nums = {4, 2, 5, 2, 4};
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){

            if(!map.containsKey(nums[i]))
                map.put(nums[i],0);

            map.put(nums[i],map.get(nums[i])+1);
        }

            for(Map.Entry<Integer, Integer> newMap : map.entrySet())
            {
                if(newMap.getValue()==1)
                {
                    result=newMap.getKey();
                }
            }
            System.out.println(result);
        }

            }




