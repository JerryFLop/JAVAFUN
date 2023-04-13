package work;

public abstract class Employee extends Person{

    private final int id;
    private static int uniqueID;
    protected final double EMPLOYEE_DISCOUNT = .10;


    public Employee(String name, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.id = ++uniqueID;
    }

    public int printID(){
        return this.id;
    }

    public double calculateDiscount(Cloth cloth){
        return EMPLOYEE_DISCOUNT * cloth.getPrice();
    }

    //Method . Signature
    public abstract void printBadge();

}
