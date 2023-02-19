package animals;

public class Animals {

    private String name;
    private int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
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
}
