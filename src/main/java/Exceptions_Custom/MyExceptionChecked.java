package Exceptions_Custom;

public class MyExceptionChecked extends Exception {

   // наследовались от Эксепшн, тут уже надо обрабатывать его (трай-кетч)

    public MyExceptionChecked(String message){
        super(message);
    }
}
