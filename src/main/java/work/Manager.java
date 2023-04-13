package work;

public class Manager extends Employee{
    private double managerSalary;

    private final double MANAGER_DISCOUNT = .05;

    public Manager(String name, Cloth[] clothingItems) {
        super(name, clothingItems);
    }

    public double calculateDiscount(Cloth cloth){
        return (super.EMPLOYEE_DISCOUNT + MANAGER_DISCOUNT)  * cloth.getPrice();
    }

    @Override
    public void printBadge() {
        System.out.println(
                this.getClass().getSimpleName() + ":" + this.getName() + "\n" + "EmployeeID" + ": "+ printID()
        );
    }

    @Override
    public void calculatePay() {
        System.out.println(this.managerSalary);
    }
}
