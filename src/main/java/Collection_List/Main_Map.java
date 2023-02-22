package Collection_List;

import java.util.HashMap;
import java.util.Map;

public class Main_Map {
    public static void main(String[] args) {

        Student kolia = new Student("Kolia", 20);
        Student kolia2 = new Student("Kolia", 21);

        Map<Student, Integer> marks = new HashMap<>();

        marks.put(kolia,75);
        marks.put(kolia2,90);
        //выводим оценку Коли
        System.out.println(marks.get(kolia));

        //вывод нетипичный
        for(Student student : marks.keySet()){
            marks.get(student);
        }
    }
}
