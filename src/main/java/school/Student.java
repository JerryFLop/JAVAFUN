package school;

public class Student { private int id; // Global variable
    private String name; //instance variables

    //constructors  a student
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
