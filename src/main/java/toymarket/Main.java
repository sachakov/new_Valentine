package toymarket;

public class Main {
    public static void main(String[] args) {
//объявляем массив игрушек, которые есть в магазине
        Toy[] toys = {
                new Car("BMW", 300, false),
                new Doll("Barbie", 350, "white")
        };
//создаем объект магазин ТОЙМАРКЕТ (конструктор, которого передает массив игрушек тойс)
        ToyMarket toyMarket = new ToyMarket(toys);
        Buyer buyer = new Buyer(1000);

        //покупаем -
        toyMarket.buyToy(buyer, "BMW");
        toyMarket.buyToy(buyer, "Barbie");


    }
}
