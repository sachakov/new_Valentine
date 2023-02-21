package Collection_List;

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
}
