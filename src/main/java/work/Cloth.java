package work;

public class Cloth {
    //  The Cloth class has the following properties - description and price
    private String description;
    private double price;

    public Cloth(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }


}
