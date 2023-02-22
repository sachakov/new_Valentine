package Revision;

public class Parrot {

    String name;
    int age;
// Конструктор без параметров
    Parrot() {
            }
    // Конструктор с параметрами
    Parrot(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
