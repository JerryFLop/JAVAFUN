package school;

public class Student {
    private  int id;
    private String name;

    private static int uniqueID = 0;

    public Student( String name){
        id = ++uniqueID;
        this.name = name;
    }

    public void printID(){
        System.out.println(id);
    }

//    public static void printID(){
//        System.out.println(uniqueID);
//    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
