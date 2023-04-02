package animalkingdom;

public class AnimalKingdome {
    public static void main(String[] args) {
        //Make an instance / object / reference variable
//        Animal animal1 = new Animal("jackie", "corgi");
//        Animal animal2 = new Animal("bingo", "German Shepard");

        Dog dog = new Dog("jakie","pitbull");
        dog.MakeAnimalSound();

        Cat cat = new Cat("Molly", "Siberian");
         //cat.makeAnimalSound();

         //Animal.printAnimalName(cat);

        //create an array of Animals
        Animal[] animalsArray = {dog, cat};
        Animal.printAnimalSounds(animalsArray);

        //Create a RoboDog
        RoboDog roboDog = new RoboDog();

        //create an array of Pets
        IPet[] petsArray = {dog, cat, roboDog};
        Animal.printPetGreeting(petsArray);
//        animal1.MakeAnimalSound();
//        animal1.setName("rob");
//        System.out.println(animal1.getName());

    }
}
