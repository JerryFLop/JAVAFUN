package LearnJava;

import java.util.Comparator;

public class PersonNameCaomparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }



}
