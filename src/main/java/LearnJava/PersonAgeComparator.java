package LearnJava;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person2.getAge().compareTo(person1.getAge());
    }
}
