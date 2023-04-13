package work;

public class SalaryEmployee extends Employee{
    private double salary;

    public SalaryEmployee(String name, double salary, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.salary = salary;
    }

    @Override
    public void printBadge() {
        System.out.println(
                this.getClass().getSimpleName() + ":" + this.getName() + "\n" + "EmployeeID" + ": "+ printID()
        );
    }

    @Override
    public void calculatePay() {
        System.out.println(this.salary);

    }


    @Override
    public double calculateDiscount(Cloth cloth) {
        return EMPLOYEE_DISCOUNT * cloth.getPrice();
    }
}
