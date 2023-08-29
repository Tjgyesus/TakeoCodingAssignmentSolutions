package day5;

import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {


        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = 0;

        for(Integer i : list){
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println(sum);


        list.stream().filter(i -> i%2==0).mapToInt(i->i.intValue()).sum();
        System.out.println(sum);
    }
}
