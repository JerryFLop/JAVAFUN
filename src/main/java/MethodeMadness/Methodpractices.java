package MethodeMadness;

import java.lang.reflect.Array;

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
//    String w = weatherCondition;
//    int t = temperature;

    System.out.println("The weather is: " + weatherCondition+ " And the temperature is : " + temperature );

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





public static void main(String[] args) {
        printName();
        System.out.println(greetUser("Jeremiah Paredes"));
    System.out.println( buyCoffee(20));
    System.out.println(buyCoffee(5));
    String[] myhobbies ={"video games", "music","Sports" } ;
    myHobbies(myhobbies);
    System.out.print(checkWeather("cool",70));
    }

}


