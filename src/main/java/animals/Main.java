package animals;

import animals.Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Bars", 7);
        Cat cat2 = new Cat("Murz",1);


       // cat.name = "Murka"; // переименовали кота, с privatom к классе Кэт бы не могли
       // System.out.println(cat.getAge());
        //System.out.println(cat.getName());
       // cat.say();

        //System.out.println("___________________________________");

       // Sheep sheep = new Sheep("Kurduchnaya", 2);
       // System.out.println(sheep.getName());
       // System.out.println(sheep.getAge());
       // sheep.say();
        //System.out.println("___________________________________");
        //сделали собаку и вызвали метод из интерфейса Дай Лапу
       // Dog dog = new Dog("Tuzik", 6);
        //dog.getPaw();
    }
}
