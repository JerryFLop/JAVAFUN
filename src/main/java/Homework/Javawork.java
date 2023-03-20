package Homework;

public class Javawork {
    public static void printNumbers(){
        for(int y = 45; y >= 1; y-- ){
            System.out.println(y);

            if( y % 3 ){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

        printNumbers();




        String FirstName="Jeremiah";
        String LastName=" Paredes";
        int[] firstArray = {103,23,34,41,75};
        int[] secondArray = {66,75,18,91,120};
        System.out.println(FirstName + LastName);

    }
}
