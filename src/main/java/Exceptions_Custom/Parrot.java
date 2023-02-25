package Exceptions_Custom;

public class Parrot {

    public String name;
    int age;
// Конструктор без параметров
    Parrot() {
            }
    // Конструктор с параметрами, добавили блок IF , чтобы выбрасывать кастомный Эксепшн
    Parrot(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new MyExceptionUnchecked("Age can't be negative!");
        }
        else {
            this.age = age;
        }
    }
    //конструктор с одним параметром
    Parrot(String name) throws MyExceptionChecked {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
