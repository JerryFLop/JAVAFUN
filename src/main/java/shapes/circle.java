package shapes;

public class circle extends shape {
    public circle(double value1, double value2) {
        super(value1,value2);
    }

    @Override // annotation
    public double calcArea(){
        return getValue1() * getValue2();
    }

}
