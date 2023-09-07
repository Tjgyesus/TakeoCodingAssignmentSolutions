package day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommonElementsArray {
    public static void main(String[] args) {



    List<Integer> list1 = List.of(1,4,6,3,7,8);
    List<Integer> list2 = List.of(2,5,8,2,5,6);

        List<Integer> list3 = new ArrayList<>(list1);

        list3.retainAll(list2);
        System.out.println("The common elements between "+list1+" and "+list2+" : "+list3);




}
}
