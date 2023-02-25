package Exceptions_Custom;

public class MyExceptionUnchecked extends RuntimeException {
//создали свой эксепшн, изначально просто Класс, когда сделали экстендс Эксепн, на значке появилась молния
    // наследовались от РанТаймЭксепшн, чтобы НЕ обрабатывать его (трай-кетч)
    //говорим, что класс МайЭксепшн - стринга, используем конструктор супер-класса предка

    public MyExceptionUnchecked(String message){
        super(message);

    }
}
