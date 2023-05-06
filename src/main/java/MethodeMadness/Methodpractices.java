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
    for (String i : hobbies)
        System.out.println(i);   {
        }
}
public static boolean checkWeather(String weatherCondition, int temperature){

       if(weatherCondition.equals("Hot")  && temperature < 80 )


    return true;
}





public static void main(String[] args) {
        printName();
        System.out.println(greetUser("Jeremiah Paredes"));
    System.out.println( buyCoffee(20));
    System.out.println(buyCoffee(5));
    String[] myhobbies ={"video games", "music","Sports" } ;
    myHobbies(myhobbies);


    }

}


