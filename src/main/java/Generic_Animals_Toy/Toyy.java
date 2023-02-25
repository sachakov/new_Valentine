package Generic_Animals_Toy;

public abstract class Toyy extends Price{
    String nameOfToy;
    String colour;
    protected int price;


    public Toyy(String nameOfToy, String colour, int price){
        this.nameOfToy = nameOfToy;
        this.colour = colour;
        this.price = price;

    }
    public void sayToy(){
        System.out.println("I'm TOy");
    }
    public int price(){
        return this.price;
    }
}
