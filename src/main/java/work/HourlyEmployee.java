package work;

public class HourlyEmployee extends Employee{
    private double hourlyRate, hoursWorked;


    public HourlyEmployee(String name, double hourlyRate, double hoursWorked, Cloth[] clothingItems ) {
        super(name, clothingItems);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printBadge() {
        System.out.println(
                this.getClass().getSimpleName() + ":" + this.getName() + "\n" + "EmployeeID" + ": "+ printID()
        );

    }

    @Override
    public void calculatePay() {
        System.out.println(this.getClass().getSimpleName()+ " pay is:"+ this.hourlyRate * this.hoursWorked);
    }

    @Override
    public double calculateDiscount(Cloth cloth) {
        return EMPLOYEE_DISCOUNT * cloth.getPrice();
    }

}
