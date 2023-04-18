import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    //red,green,refactor


    @Test
    public void  addTest(){

        Calculator calculator = new Calculator();
        int val1= 7;
        int val2= 10;
        int expected = val1 + val2;
        //when
        int actual = calculator.add(val1, val2);
        //Then
        Assert.assertEquals(expected,actual);
    }
}
