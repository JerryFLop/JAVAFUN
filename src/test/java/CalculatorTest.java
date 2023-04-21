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

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int val2= 10;
        int val1 = 7;
        int expected = val2 + val1;
        //when
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        double val1 = 20;
        double val2 = 20;
        double expected = Math.pow(val2,val1);
       double  delta = Math.pow(val2,val1);
        double actual = calculator.multiply(val2,val1);
        Assert.assertEquals(expected,actual,delta);


    }
    @Test
    public void squareTest() {
        Calculator calculator = new Calculator();
        int val1 = 20;
        int val2 = 2;
        double expected = Math.pow(val1,val2);
        double actual = calculator.square(val1, val2);
        int delta = 0;
        Assert.assertEquals(expected, actual,delta);
    }

    @Test
    public void squrootTest() {
        Calculator calculator = new Calculator();
        int val1 = 10;
        double val2 = Math.sqrt(val1);
        double expected =  val2;
        double actual = calculator.squareroot(val1,val2);
        int delta = 0;
        Assert.assertEquals(expected,actual,delta);

    }

    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator();
        int val1 = 20;
        double val2 = Math.exp(val1);
        double expected = val2;
        double actual = calculator.exponent(val1,val2);
        double delta = 0;
        Assert.assertEquals(expected,actual,delta);



    }


}
