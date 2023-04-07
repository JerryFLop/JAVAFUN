package Assessments;

public class Ten {
//    Question 1:
//    create a static method named printName.
//    The method does not accept any parameters and does not return a value.
//    It should just print your full name.

   public static void printName(){
       System.out.println("Jeremiah " + "Paredes");
           }

//    Question 2:
//    create a static method named greetUser.
//    The method accepts only one parameter named username and returns a value.
//    The value returned should be a concatenation of the string "Welcome to my website" plus the user's name
//    Call or invoke your method.
//

   public static String greetUser(String username ){
   String greetUser = "Welcome to my website";
   return greetUser + username;
    }


//    Question 3:
//    create a static method named buyCoffee.
//    The method accepts only one parameter named dollars.
//    The price of coffee NEVER changes and is ALWAYS $1
//    The value returned should be the change left after buying coffee
//    Call or invoke your method twice inside main with two differnt argument (values)

//    Question 4:
//    create a static method named myHobbies.
//    The method accepts only one parameter which is an array of your hobbies.
//    The method does not return any values. It should just print out your hobbies when invoked
//  Call or invoke your method.

//    public static void myHobbies(String[] {"Video gmaes","sports","music"};){
//
//    System.out.println(hobbies);}


//    Question 5:
//    create a static method named checkWeather.
//    The method accepts two parameters String weatherCondition and an int temperature.
//    The method will RETURN one of the values below based on the weather condition
//
//  - if weatherCondition is hot and temperature is greater than 80 - " Wear shorts "
//            - if weatherCondition is cool and temperature is greater than 50  - " Wear wind breakers "
//            - if weatherCondition is cold and temperature is below 50 - " Wear a jacket "
//            - if weatherCondition is anything else -  " No such weather condition "
//
//    Call or invoke your method.




//    Question 6:
//    create a static method named areaOfTriangle.
//    The method accepts two parameters (base and height)
//    The method should just return the computed area of the triangle
//    Call or invoke your method.







    public static void main(String[] args) {










        //        myHobbies();












        printName();

   System.out.println(greetUser(" Jeremiah"));























    }
}
