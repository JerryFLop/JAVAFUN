package pluralsight;
import java.util.*;

public class Maps {



    public Map<String, String> dictionary;

    public Maps() {
        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("SEO", "Search engine optimization");
        dictionary.put("SaaS", "Software as a service");
        dictionary.put("UX", "User experience");

    }

    public void print() {

//        for (String ter : dictionary.keySet()){
//            System.out.println("Term: " + ter);}
//
//        for (String def : dictionary.values()){
//            System.out.println("Definition: " + def );}

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println( entry.getKey()+": " + entry.getValue());
        }

    }

//
//
//
//
//    public void runApp() {
//        Scanner scanner = new Scanner(System.in);
//
//            while (true) {
//                System.out.println("Enter lookup word or Q to quit");
//                String input = scanner.nextLine();
//                if (input.toUpperCase().equals("Q")) {
//                    System.out.println("Thanks for using Dev Dictionary");
//return;
//                } if (!dictionary.containsKey(input))
//                    System.out.println("Word doesn't exist, try again or Q to quit");
//                else
//                    System.out.println(input + ": " + dictionary.get(input));
//            }
//            }
        }











