import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)   //Запускаем тест по определённому правилу.
public class ProgramTest {
    private int price;

    private int discount;

    private int expectedResult;
    private String someString;

    public ProgramTest( int discount, int price, int expectedResult, String someString) {           //Конструктор
        this.price = price;
        this.discount = discount;
        this.expectedResult = expectedResult;
        this.someString = someString;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {-1,100,100,"1"},
                {0,100,100,"2"},
                {25,100,75,"3"},
                {50,100,50,"4"},
        };
    } //двумерный массив

    @Test
    public void getFinalPrice() {
        System.out.println(someString);
        Program program = new Program(price,discount);
        int finalPrice = program.getFinalPrice();
        Assert.assertEquals("Ожидаемый результат отличается от фактического",expectedResult, finalPrice);
    }

//    @Test
//    public void getPrice() {
//    }
}