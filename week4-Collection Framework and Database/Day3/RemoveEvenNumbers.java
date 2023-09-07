package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=20; i++){
            list.add(i);
        }
        System.out.println(list);

        List<Integer> evenNumbers = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==0){
                Collections.addAll(evenNumbers,list.get(i));

            }

                        }

        System.out.println(evenNumbers);

    }
}
