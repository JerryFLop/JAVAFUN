package work;

public class Entreprenuer extends Person{
    private double revenue;
    private double expenses;
    private final double ENTREPRENEUR_DISCOUNT = .02;

    public Entreprenuer(String name, double revenue, double expenses, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.revenue = revenue;
        this.expenses = expenses;
    }


    @Override
    public void calculatePay() {
        double profit = this.revenue - this.expenses;
        System.out.println("Entrepreneur pay is " + profit);
    }

    //String representation - toString();

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "name is " + getName() +
                "revenue=" + this.revenue +
                ", expenses=" + this.expenses +
                '}';
    }


    @Override
    public double calculateDiscount(Cloth cloth) {
        return ENTREPRENEUR_DISCOUNT * cloth.getPrice();
    }
}
