package calc;

public class Calculator {
    //TDD miust fail first
    //red
    //green
    //refactor
public int add(int value1, int value2){

    return value1 + value2;
 }

//subtract

    public int subtract(int value1, int value2){

        return 0;
    }


    public double multiply(double value1, double value2){
    return value1 * value2;


}


    public double square(int value1, int value2){
        return Math.pow(value1,value2);
    }



    public double squareroot(int value1, double value2){

        if(0 <= value2){
            return value2 ;
        } else {
            return value1;
        }


    }

public double exponent(int value1, double value2){
    return Math.exp(value2);
}
  //multiply
  //divide
  //sqaure
    //sqaureroot
    //exponent







}
