package animalkingdom;

public  abstract class Animal {
    //encapsulation
    private String name;
    private String breed;

    // Constructor
    public Animal(String name, String breed ){
        this.name = name;
        this.breed = breed;
    }
    //Abstract methods
    public abstract void makeAnimalSound();

    //Polymorphism
    //create a static  concrete method
    public static void printAnimalName(Animal animal){
        if(animal instanceof  Dog){
            System.out.println(animal.getName());
        }else if(animal instanceof Cat){
            System.out.println(animal.getName());
        }else{
            System.out.println("No such Animal");
        }
    }

    public static void printAnimalSounds(Animal[] animals){
        //enhanced for loop - forEach loop
        for (Animal a: animals ) {
            a.makeAnimalSound();
        }
    }

    //create a polymorphic for how Pets greets - Dog, Cat , RoboDog

    public static void printPetGreeting( IPet[] pets ){
        for (IPet pet: pets ) {
            pet.greetOwner();
        }
    }



    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String newName){
        this.name = newName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
