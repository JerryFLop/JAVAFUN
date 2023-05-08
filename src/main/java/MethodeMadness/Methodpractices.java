package MethodeMadness;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Methodpractices {
public static void printName(){
    System.out.println("Jeremiah Paredes");
}
public static String greetUser(String username){
    return "Welcome to my website " + username ;
}
public static double buyCoffee(double dollars){
    final int priceForCoffee = 1;
    double changeLeft = dollars - priceForCoffee;
    System.out.print("Here's your change :");
    return changeLeft;
}
public static void myHobbies(String[] hobbies){
    System.out.println( "My Hobbies are : ");
    for (String i : hobbies)
        System.out.println("- "+i);   {
        }
}
public static String checkWeather(String weatherCondition, int temperature){

    System.out.print("The weather is: " + weatherCondition+ ", And the temperature is : " + temperature + ", so :" );

    if(weatherCondition.equals("cot")  && temperature > 80 ){
        return " Wear shorts ";
       } else if (weatherCondition.equals("cool") && temperature > 50) {
        return  " Wear wind breakers ";
       } else if (weatherCondition.equals("cold") && temperature < 50) {
        return  " Wear a jacket " ;       }
           else {
               return    " No such weather condition";
       }
}
public static int triangleArea(int base , int height){

    int area = base * height /2;
    System.out.print("Area of the triangle is: ");

    return area;
}

public static int randomNumber(){
    Random random = new Random();
    int randomNumbers = random.nextInt(6) + 1;

    switch (randomNumbers) {
        case 1:
            System.out.println("you rolled a one");
        break;
        case 2:
            System.out.println("you rolled a two");
            break;
        case 3:
            System.out.println("you rolled a three");

            break;
        case 4:
            System.out.println("you rolled a four");
            break;
        case 5:
            System.out.println("you rolled a five");
            break;
        case 6:
            System.out.println("you rolled a six");
        break;




    }




    return randomNumbers;
}

public static void userName (){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter username");
    String name = scanner.nextLine();

    if (name.equals("Aliyah")){
        System.out.println("Hello Aliyah");
    } else if (name.equals("Hakeem")) {
        System.out.println("Hello Hakeem");
    }else {
        scanner.close();
    }

}



public static void main(String[] args) {
        printName();
        System.out.println(greetUser("Jeremiah Paredes"));
    System.out.println( buyCoffee(20));
    System.out.println(buyCoffee(5));
    String[] myhobbies ={"video games", "music","Sports" } ;
    myHobbies(myhobbies);
    System.out.println(checkWeather("cool",70));
    System.out.println(triangleArea(20,30));
    randomNumber();
userName();

    }

}


