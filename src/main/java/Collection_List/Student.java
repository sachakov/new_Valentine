package Collection_List;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //из класса Object переопределили метод туСтринг для преобразования студента в стрингу
    @Override
    public String toString (){
        return this.getName();
    }
//переопределили мз класса Object, метод для сравнения объектов, т.к у нас есть класс Студент,
    // он знает, что есть нейм и ейдж, т.е по ним можно сравнить (метод EQUALS важно)
    //можем оставить только возраст или только имя, или оба
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
//метод для расчета/задания хэшкода
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
