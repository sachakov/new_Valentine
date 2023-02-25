package Generic_Animals_Toy;

public class Dollss extends Toyy {

    //конструктор супер-класса переопределяем


    public Dollss(String nameOfToy, String colour, int price) {
        super(nameOfToy, colour, price);

    }
    public void saySomesing(){
        System.out.println("i'm pretty doll");
    }

    @Override
    public int price() {
        return price;
    }
}
