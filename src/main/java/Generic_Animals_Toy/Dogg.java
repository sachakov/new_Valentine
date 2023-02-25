package Generic_Animals_Toy;

public class Dogg extends Animall {

    //конструктор супер-класса переопределяем

    public Dogg(String name, int age, int price) {
        super(name, age, price);

    }
    public void bark(){
        System.out.println("Gav");
    }

   /* @Override
    public int price() {
        return price;
    }*/

}
