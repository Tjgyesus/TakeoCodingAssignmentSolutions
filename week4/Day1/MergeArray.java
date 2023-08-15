package Day1;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(1);
        list.add(4);
        list.add(7);
        list2.add(3);
        list2.add(30);
        list2.add(23);
        list2.add(31);
        System.out.println("List 1"+list);
        System.out.println("List 2"+list2);



        list3.addAll(list2);
        System.out.println("List 3"+list3);
        list3.addAll(list);
        System.out.println("List 3"+list3);


    }
}
