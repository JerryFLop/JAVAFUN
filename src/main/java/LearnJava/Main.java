package LearnJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        Collections.sort(numbers);
        System.out.println();//3,13,23
        List<Person> people = new ArrayList<>();
        people.add(new Person("nim",65));
        people.add(new Person("john",5));
        people.add(new Person("kim",89));
        //Collections.sort(people);
        //System.out.println(people);
        // PersonNameCaomparator personNameCaomparator = new PersonNameCaomparator();
        // Collections.sort(people,personNameCaomparator);
        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
           Collections.sort(people,personAgeComparator);
        System.out.println(people);


    }

}
