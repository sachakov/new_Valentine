package Calculatore_String;

public class Calculator {

    private int a;
    private int b;
    private char operator;

//метод calculate принимает на вход стрингу типа 2+2 ретурн 4
    public int calculate (String expression){
    InputHelper inputHelper = new InputHelper(expression);
    a = inputHelper.getFirstNum();
    b = inputHelper.getSecondNum();
    operator = inputHelper.getOperator();

    //внутри метода calculate создали объект инпутхелпер
    if (operator == '+'){ //если метод гетоператор возвращает плюс - складывай
        return a + b;
    }
    else {
        return a - b;
    }



    }
}
