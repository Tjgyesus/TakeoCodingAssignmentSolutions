package Day1.student;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class StudentCalculator {


    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

         studentList.add(new Student("Student 1", 23, 95));
         studentList.add(new Student("Student 2", 20, 87));
         studentList.add(new Student("Student 3", 25, 99));
         studentList.add(new Student("Student 4", 19, 80));

         studentList.add(new Student("Student 5", 20, 35.0));


        double gradeTotal=0;

        for(Student s: studentList){
            gradeTotal = gradeTotal + s.getGrade();
        }

        double gradeAverage = gradeTotal/ studentList.size();
        System.out.println("Average Grade: "+gradeAverage);

        for(Student s: studentList){
            if(s.getGrade()>90){
                System.out.println("Students above 90 grade");
                System.out.println(s.getName()+"\t"+s.getAge());
            }
        }







    }
}
