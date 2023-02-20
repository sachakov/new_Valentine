package Calculator;
import Calculatore_String.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
//импортнули класс калькулятор

public class Calculator_test {
//создаем новый объект калькулятор
    Calculator calculator = new Calculator();

    @BeforeClass
    public static void setUp(){
        System.out.println("Testing in process...");
    }
    //чтобы Метод стал тестом, надо повесить аннотацию тест
    @Test
    public void testSum(){
        Assert.assertEquals(4,calculator.calculate("2 + 2"));
        Assert.assertEquals(4,calculator.calculate("2   + 2"));
        Assert.assertEquals(4,calculator.calculate("2 +   2"));
        Assert.assertEquals(202,calculator.calculate("200 + 2"));
        Assert.assertEquals(600,calculator.calculate("200   +   400"));
    }
    @Test
    public void testMinus(){
        Assert.assertEquals("Minus doesn't work",7,calculator.calculate("9 - 2"));
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Testing is over");
    }
}
