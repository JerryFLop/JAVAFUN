package work;

public abstract class  Person implements Payable,Discountable{
    private String name;
        Cloth[] clothingItems;

        public Person(String name, Cloth[] clothingItems){
            this.name = name;
            this.clothingItems = clothingItems;
        }

        public String getName(){
            return this.name;
        }

        public static void printPay(Person[] people){
            for(Person p: people){
                p.calculatePay();
            }

        }


}
