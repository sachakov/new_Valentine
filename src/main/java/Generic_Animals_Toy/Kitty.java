package Generic_Animals_Toy;

public class Kitty extends Animall {
//конструктор супер-класса переопределяем



    public Kitty (String name, int age, int price) {
        super(name, age, price);

    }
    //личный метод кота
    public void meoww(){
        System.out.println("MEOW");
    }

    /*@Override
    public int price() {
        return price;
    }*/
}
