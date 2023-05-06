package collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionFramwork {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Jerry");
        System.out.println(names);



        List<String> namess = new LinkedList<>();
        namess.add("Mike");
        namess.add("Jerry");
        System.out.println(namess);


    }

}
