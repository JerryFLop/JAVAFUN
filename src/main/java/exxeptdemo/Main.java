package exxeptdemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void createFile() throws IOException {
        File file = new File("src/main/resources/no_such_path.txt");
        file.createNewFile();
    }


//    public static void readFile(){
//        List<String> lines = Collections.emptyList();
//        lines = Files.readAllLines(Paths.get("src/main/resources/names.txt"));  // provoke an exception
//        for (String line : lines) System.out.println(line);
//    }





    public static void main(String[] args) throws IOException {
        createFile();



//        int[] numbers = {1,2,3};
//        System.out.println(numbers[3]);
//
//
//        String name = null;
//        if(!name.equals(null))
//        System.out.println(name.length());
//        System.out.println("Hello "+ name);
//
//
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("");
//



    }


}
