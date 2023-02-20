package toymarket;

public class ToyMarket {
//для организации магазина, надо объявить массив игрушек

    private Toy[] toys; //      объявили массив игрушек

    // в конструктор будем передавать массив игрушек, который будет хранить наш магазин

    public ToyMarket(Toy[] toys) {
        this.toys = toys;
    }
//объявили метод покупкаИгрушкиПоИмени принимает стрингу с именем,
    private Toy getToyByName(String name){
    for(Toy toy : toys){
        if(toy.getName().equals(name)){
            return toy;
        }
    }//если такого имени не будет - вернет первую игрушку в массиве
    //return toys[0];
        throw new RuntimeException("There is no such toy");
    }

    //объявляем метод байТой для покупки игрушек, метод принимает байера и имя игрушки
    public void buyToy(Buyer buyer, String nameOfToy){
    Toy chosenToy = getToyByName(nameOfToy);
    if (buyer.getMoney() > chosenToy.getPrice()){
        buyer.decreaseMoney(chosenToy.getPrice());
        System.out.println("Toy bought" + nameOfToy);
    }
    else {
        System.out.println("Not enough money for" + nameOfToy);
    }
    }
    //теперь прописываем механизм покупки


}
