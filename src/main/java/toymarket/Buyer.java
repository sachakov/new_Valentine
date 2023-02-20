package toymarket;

public class Buyer {

    private int money;

    public Buyer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void decreaseMoney (int money){
        this.money = this.money - money;
    }
}
