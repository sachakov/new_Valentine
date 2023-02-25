package Generic_Animals_Toy;

public class Animall {

     String name;
     int age;
     int price;

    public Animall(String name, int age, int price){
        this.age = age;
        this.name = name;
        this.price = price;
    }
    public void sayAnimal(){
        System.out.println("I'm anamall-rrr");
    }

    public int price(){
        return price;
    }
}
