package pluralsight;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
    }




    public class BlogTitles {

        private Set<String> javaTitles;

        private Set<String> webTitles;

        public BlogTitles() {

            Set<String> javaTitles = new HashSet<>();

            Set<String> webTitles = new HashSet<>();

        }

        public void initalizeTitles() {

            javaTitles.add("Leveraging Java Data Structures");
            javaTitles.add("Java Lambdas: Getting Started");
            javaTitles.add("My First Spring Boot App");
            javaTitles.add("Spring Boot and React");

            webTitles.add("Creating the Same App with React and Angular");
            webTitles.add("Learn Kubernetes in Under 4 Hours");
            webTitles.add("My First Spring Boot App");
            webTitles.add("Spring Boot and React");
            Set<String> intersection = new HashSet<>(javaTitles);
            intersection.retainAll(webTitles);
            System.out.println(intersection);

            Set<String> strictlyJavaSet = new HashSet<>(javaTitles);
            strictlyJavaSet.removeAll(webTitles);
            System.out.println(strictlyJavaSet);

            Set<String> union = new TreeSet<>(javaTitles);
            union.addAll(webTitles);
            System.out.println(union);


        }
    }


}
