package shapes;

public class shape { private double value1;
    private  double value2;

    //Default Constructor
    public shape(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public double calcArea(){
        return 0.0;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
}

