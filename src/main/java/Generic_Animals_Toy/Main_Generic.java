package Generic_Animals_Toy;

import java.util.ArrayList;
import java.util.List;

public class Main_Generic {
    public static void main(String[] args) {

    Buyerr buyerr = new Buyerr(1000);
    //______________________________________________________________________________________________
    Kitty kitty = new Kitty("Murzzi", 11, 50);
    Kitty kitty2 = new Kitty("Murzz", 10, 51);
    Dogg dogg = new Dogg("Bimm", 3, 400);
    Dogg dogg1 = new Dogg("Bim", 2, 30);

        List<Dogg> doggs = new ArrayList<>();//создали коллекцию животных
        doggs.add(dogg1);
        doggs.add(dogg);

    /*Toyy dollss = new Dollss("Bambie", "white", 100);
    Toyy coches = new Coches("ZAZ", "metallic", 150);
    List<Toyy> toyys = new ArrayList<>();//создали коллекцию игрушек
    toyys.add(dollss);
    toyys.add(coches);*/
    //______________________________________________________________________________________________

    //теперь делаем собственно объект ЗооМагаз
    Market_Toy<Dogg> zooMarket = new Market_Toy<>(doggs);
    zooMarket.getGoogByIndex(0).sayAnimal();

   //теперь делаем собственно объект Магаз Игрушек
   /* Market_Toy<Toyy> toyMarket = new Market_Toy<>(toyys);
    toyMarket.getGoogByIndex(0).sayToy();*/
    }
}
