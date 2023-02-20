package Calculatore_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//класс, который будет помогать обрабатывать стрингу на ввод калькулятора и вычленять из нее цифры и знак +/-*
public class InputHelper {
    private Pattern pattern;
    private Matcher matcher;

    //делаем конструктор, принимающий наше выражение

   private String expression;
//Конструктор
    public InputHelper(String expression){
        this.expression = expression;
        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);

        if(!isStringCorrect()){
            throw new RuntimeException("String is incorrect");
        }
    }
//надо разбить на три метода- одно число, второе и знак. 2 + 2 (1st digit - zero position itd)

    public int getFirstNum(){
    pattern = Pattern.compile("^(\\d+)");
    matcher = pattern.matcher(expression);
    matcher.find();
        return Integer.parseInt(matcher.group());
        // return Integer.parseInt(expression.substring(0,1)); первая версия
    }



    public int getSecondNum(){
        pattern = Pattern.compile("(\\d+)$");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
       // return Integer.parseInt(expression.substring(4));
    }
    public char getOperator(){
        pattern = Pattern.compile("([+-])");
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group().charAt(0); // парсинг строки в чар
   // return expression.toCharArray()[2];
    }

//200     +    200 (проверяем регуляркой, что можно больщие числа и много пробелова между ними
    private boolean isStringCorrect(){
                //    перенесли неверх в конструктор   //  Pattern pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
                                             //  Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
