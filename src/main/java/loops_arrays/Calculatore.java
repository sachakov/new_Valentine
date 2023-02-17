package loops_arrays;

public class Calculatore { // создали Класс калькулятор
    int sum (int... values) {//созади метод sum, принимающий массив интов под именем values, троеточие - массив
        int sum = 0;    // точка отсчета, принимаем переменную за ноль
        for (int x : values){
            sum += x;
        }
        return sum; // ключевое слово для возврата переменной
    }

    }

