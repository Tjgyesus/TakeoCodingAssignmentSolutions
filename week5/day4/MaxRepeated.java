package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxRepeated {
    public static void main(String[] args) {
        List<Integer> list = List.of(7,8,1,8,9,7,9,8,8);
        List<Integer> list1 = new ArrayList<>();


        for(Integer i: list){
            if(Collections.frequency(list, i) > 1) {
                list1.add(i);

//                list1.add(Collections.frequency(list,i));

            }
        }
        System.out.println(list1);
//        System.out.println(Collections.max(list1));
            }

        }
//        System.out.println(list1);
//
//


//    }
//}
