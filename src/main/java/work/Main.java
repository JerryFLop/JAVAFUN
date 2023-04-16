package work;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> urlList;
    public static void main(String[] args) {
//an instance of hourly employee
        //instance, object, reference variable
        // Cloth[] arrayOfClothingItems = new Cloth[3];
        Cloth clothingItem1 = new Cloth("shirt", 20.0);
        Cloth clothingItem2 = new Cloth("jeans", 10.0);
        Cloth clothingItem3 = new Cloth("shoes", 5.0);
        Cloth[] arrayOfClothingItems = {clothingItem1, clothingItem2, clothingItem3};

        HourlyEmployee hourlyEmployee = new HourlyEmployee( "mike", 15.0, 40.0,arrayOfClothingItems );
        SalaryEmployee salariedEmployee = new SalaryEmployee( "jane", 1000.0, arrayOfClothingItems);
        Entreprenuer entrepreneur = new Entreprenuer("Money Ray", 100.0, 20.0, arrayOfClothingItems);

        //invoke or call or use  the print bade method on the hourly and salaried employees
        //ObjectName.nameOfMethod();
//
        hourlyEmployee.printBadge();
        System.out.println("=================");
        salariedEmployee.printBadge();

        System.out.println(entrepreneur);

        //Create an array of peeps that are payable
        Person[] people = {hourlyEmployee, salariedEmployee, entrepreneur};

        //invoke the static printPayMethod
        //static methods belong to the Class NOT the object
        Person.printPay(people);



        //To do
        /*
            Every Person (has_A)  an array of clothingItems of type Cloth
            The Cloth class has the following properties - description and price
            Every employee gets a discount that NEVER changes of 10%
            A manager is also an Employee but managers get an additional 5% discount on top of the 10% discount
            Entrepreneurs only get a 2% discount
            Create a way to calculateDiscount( ) for a Clothing item. Keep in mind that all people get discounts!!!
         */

        Manager manager = new Manager("Tom", arrayOfClothingItems);
        System.out.println(manager.calculateDiscount(clothingItem1));
        System.out.println(hourlyEmployee.calculateDiscount(clothingItem1));



//        ArrayList<Integer> listOfNumbers  = new ArrayList<>();
//        listOfNumbers.add(1);
//        listOfNumbers.add(11);
//        listOfNumbers.add(1111);
//        listOfNumbers.add(11111);
//        listOfNumbers.add(111111);
//        listOfNumbers.add(11111111);
//        listOfNumbers.add(1111111111);
//        System.out.println(listOfNumbers.contains(2));
//          List<String> urlList = new ArrayList<>();
//        urlList.add("https://pluralsight.com/search?q=java");
//        urlList.add("https://medium.com/search?q=java");
//        urlList.add("https://stackoverflow.com/questions/tagged/java");
//        urlList.add("https://stackoverflow.com/search?q=java+list");
//        urlList.add("https://reddit.com/r/java");
//        urlList.add("https://reddit.com/r/javahelp");
//
//
//
//
//        System.out.println("Links from stackoverflow.com:");
//        for (String u : urlList){
//            if ( u.contains("stackoverflow.com")){
//                System.out.println(u);
//            }
//
//        }
//
//        boolean del = urlList.remove("https://medium.com/search?q=java");
//        System.out.println("Removed Medium result: " + del);
//        System.out.println(urlList);
//
//
//
//
//
        }


    }



