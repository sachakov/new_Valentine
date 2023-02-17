package loops_arrays;

public class Cat { // чертеж автомобиля
    int age;
    String name; //объявили переменные для объекта, которые будут принадлежать объекту

    void say () {  //создали метод
        System.out.println("Cat " + name + " says MEWWW");
    }
    void saySomething (String value){ // создали второй метод, принимающий стрингу с название value
        System.out.println("Cat "+ name +" says " + value);
    }
}
