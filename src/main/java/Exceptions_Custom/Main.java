package Exceptions_Custom;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//попугаи из конструктора с 2-мя параметрами
Parrot kesha = new Parrot("Kesha", 10);
Parrot kesha1 = new Parrot("Kesha1", -1);
Parrot kesha2 = new Parrot("Kesha2", 1);
Parrot kesha3 = new Parrot("Kesha", 2);
Parrot kesha31 = new Parrot("Kesha", 1);
Parrot kesha32 = new Parrot("Kesha", 1);
//_______________________________________________________
        //попугаи из конструктора с одним параметрам и CHECKED EXCEPTION



        //ДЕЛАЕМ трай - кетч для обработки чект эксепшна
try {
    Parrot kesha99 = new Parrot("Kesha99");
    System.out.println(kesha99.getName());
} catch (MyExceptionChecked e){
    System.out.println(e.getMessage());
}

        // Map - коллекция ключ-значений, уникальность ключа определяется так же как с хэш-кодом
        // kesha31 == kesha4, для Мапы эти коды одинаковы, одинаковый хэш код или нет))
        Map<Parrot, String> parrotsColors = new HashMap<>();
            parrotsColors.put(kesha, "white");
            parrotsColors.put(kesha1, "black");
            parrotsColors.put(kesha2, "red");
            parrotsColors.put(kesha3, "yellow");
            parrotsColors.put(kesha31, "white");
            parrotsColors.put(kesha32, "azul");

        for (Parrot key: parrotsColors.keySet()) {
                System.out.println( "Parrot " + key + ", color  "+ parrotsColors.get(key));

       }


    }
}
