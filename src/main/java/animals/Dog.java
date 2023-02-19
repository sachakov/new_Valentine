package animals;

public class Dog implements getPaw_interface {

    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getPaw() {
        System.out.println("Here is my paw");
    }

    String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new AssertionError("Age is negative value");
        }

    }
    public void say(){
        System.out.println("Rrrrr");
    }
}
