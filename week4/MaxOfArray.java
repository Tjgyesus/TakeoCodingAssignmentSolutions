package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(1);
        list.add(4);
        list.add(7);
        System.out.println(list);
        System.out.println(Collections.max(list));



    }
}
