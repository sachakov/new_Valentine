package Collection_List;

import java.util.HashSet;
import java.util.Set;

public class Main_Equals_Set {
    public static void main(String[] args) {

        Student kolia = new Student("Kolia", 20);
        Student kolia2 = new Student("Kolia", 20);

        //перед этим, в классе Студент переопределили метод Equals из класса Object
        System.out.println(kolia.equals(kolia2));

        //создали Сэт (по сути массив для уникальных объектов по своим параметрам) экономия памяти

        Set<Student> students = new HashSet<>();
        students.add(kolia);
        students.add(kolia2);
        for(Student w : students){
            System.out.println(w);
        }
    }
}
