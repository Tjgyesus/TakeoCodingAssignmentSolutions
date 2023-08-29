package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByArrayKey {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("John", 30));
        personList.add(new Person("Michael", 28));
        personList.add(new Person("Sam", 25));
        personList.add(new Person("Mark", 33));

        Map<Integer, List<Person>> groupedbyage = personList.stream().collect(Collectors.groupingBy(p -> p.age));
        System.out.println("Grouped by age - " + groupedbyage);


    }


}
    class Person{
        String name;
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

