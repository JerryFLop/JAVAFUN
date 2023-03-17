package lecture;

public class Main {
    public static void main(String[] args) {
        String productName;  //declare a variable
        int quantity = 2;
        long productID = 1234567891;
        float price = 20.0f;
        productName = "T-shirt";  // assign a value to the variable
        char size = 'L';
        boolean onSale = true;
        //constant variable
        final double TAX = .10;
        // String  productname = "T-shirt";  // initializing  variable

        float halfPrice = price / 2; // statement

        double total =  price * quantity;
        System.out.println(total);
        //we want to figure out the amount left after giving 3 peeps $6 each
        // $20 / 3 = $6 remainder of $2
        double cashLeftOver = price % 3;
        System.out.println(cashLeftOver);

        double priceOfBags = .50;
        int numberOfBags = 3;
        double costOfBags = priceOfBags * numberOfBags;
        //additional assignment operator
        // total = total + costOfBags;
        total += costOfBags;
//        System.out.println("Our new total " + total);

        //Increment - PostFix++  vs  ++Prefix
//        System.out.println(quantity++);
//        System.out.println(quantity);

//        int increaseQty = ++quantity;
//        System.out.println(increaseQty);

        //System.out.println("1" + 1);


        System.out.println(
                "productID : " + productID + "\n"
                        +  "productName : " + productName + "\n"
                        +  "onSale : " + onSale + "\n"
                        +  "Size :" + size + "\n"
                        +  "Total : $" + total

        );

        //Conditionals

        if(onSale){
            price = halfPrice;  //set the price to half-price
            System.out.println("It will only cost u $" + price); // print out - " it will only cost you ...
        } else if (price < 50.00){
            System.out.println("its in my budget");

        }
        else{
            System.out.println("Not on sale. Total =" + price);
        }
        double priceCheck = (onSale) ?  halfPrice : price;
        System.out.println(priceCheck);

        productName = "T-shirt";  // assign a value to the variable

        productName = "Sweat shirts";

        // String  productname = "T-shirt";  // initializing  variable
        System.out.print(productName);
        System.out.print(quantity);

        char[] tShirtSizes = {'S','M','L','X', 'Y', 'U'}; //declared an initailize an array
        // index position zero (start)
        //Element are things inside

        //select from an array

        tShirtSizes[3] = 'H';

        System.out.println(tShirtSizes[4]);

        System.out.println(tShirtSizes[tShirtSizes.length - 1]);


        for(int indexPosition = 0; indexPosition < tShirtSizes.length ; indexPosition++ ){
            System.out.println("The current index position is : " + indexPosition);

        }  int indexPosition = 0;
        while ( indexPosition < tShirtSizes.length ){

            System.out.println("The current index position is : " + tShirtSizes[indexPosition]);
            indexPosition++;


        }




    }
}
