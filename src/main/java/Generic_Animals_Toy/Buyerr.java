package Generic_Animals_Toy;

public class Buyerr {
    private int money;

    public Buyerr(int money){
        this.money = money;
    }
    //делаем метод для траты денег
    public void spendTheMoney(int moneyToSpend){
        money = money - moneyToSpend;
    }
}
