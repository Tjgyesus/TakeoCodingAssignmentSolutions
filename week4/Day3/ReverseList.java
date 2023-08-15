package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=20; i++){
            list.add(i);
        }
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
