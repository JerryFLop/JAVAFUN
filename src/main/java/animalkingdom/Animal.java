package animalkingdom;

public  abstract class Animal {
    private String name;
    private String breed;


    // Constructor
    public Animal(String name, String breed ){
        this.breed = breed;
        this.name = name;
    }
    public abstract void MakeAnimalSound();

    public static void printAnimalSounds(Animal[] animals){
 for( Animal a: animals){
     a.MakeAnimalSound();

 }
    }
    public static void printPetGreeting(IPet[] pets){
        for( IPet pet: pets){
            pet.Greetowner();

        }
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
