package Generic_Animals_Toy;

import java.util.List;
//поставили <E>, чтобы можно было использовать неопределенный тип
public class Market_Toy<E extends Animall> {
    //хотим, чтобы все (куклы, машинки, собаки, коты) хранились в модной коллекции,
    //потом ввели тип Т - ДЖЕНЕРИК, типа такой тип, пока не знаю какой, узнаю, когда создам
    // Дженерик - неопределенный тип;
   // private List<Object> goods;

    public List<E> goods;

    //конструктор магазина
   //до этого был Лист Обжектов, поменяли на прайс, чтобы был метод прайс
/*
    public Market_Toy(List<E> goods){
        this.goods = goods;*/
   // }
    public E getGoogByIndex(int index){
        return goods.get(index);
    }
    public int getPriceByIndex(int index){
        return goods.get(index).price();
    }





}
