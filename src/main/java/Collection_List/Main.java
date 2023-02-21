package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создали трех студентов
        Student vasia = new Student("Vasia", 20);
        Student vera = new Student("Vera", 21);
        Student nadia = new Student("Nadia", 19);

        //классический массив создали из этих студентов (array)
        Student[] students = {vasia, vera, nadia};

        //массив создали из коллекции ArrayList из этих студентов (array)
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(vasia);
        studentsList.add(vera);
        studentsList.add(nadia);
        System.out.println(studentsList.size());
        //перед этим сделали Класс Comparator by age! потом создали соотв. объект
        ComparatorByAge comparatorByAge = new ComparatorByAge();

        //делаем сортировку нашего массива (ArrayList) методом сорт и нашего класса Компаратор
        studentsList.sort(comparatorByAge);
        //напечатал сортированный массив/лист в цикле, НО В НАЧАЛЕ переопределил метод туСтринг в классе Студент
       for(Student x : studentsList){
            System.out.println(x);
        }
    }
}
