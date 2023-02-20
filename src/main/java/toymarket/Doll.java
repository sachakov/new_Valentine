package toymarket;
// создали класс Кукла, который наследует Той
public class Doll extends Toy {

    private String colorOfHair;
//конструктор для Куклы
    public Doll(String name, int price, String colorOfHair){
    super(name, price);
    this.colorOfHair = colorOfHair;
    }
}
