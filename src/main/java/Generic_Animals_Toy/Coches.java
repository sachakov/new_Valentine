package Generic_Animals_Toy;

public class Coches extends Toyy  {

    //конструктор супер-класса переопределяем

    public Coches(String nameOfToy, String colour, int price) {
        super(nameOfToy, colour, price);

    }
    public void beep (){
        System.out.println("beep-beep");
    }

    @Override
    public int price() {
        return price;
    }
}
