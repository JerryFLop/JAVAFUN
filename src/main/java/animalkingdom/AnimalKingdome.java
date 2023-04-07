package animalkingdom;

public class AnimalKingdome {
  public static void main(String[] args) {
        //Make an instance / object / reference variable

        Dog dog = new Dog("jackie", "Corgi");
        //dog.makeAnimalSound();

        Cat cat = new Cat("Molly", "Siberian");
        //cat.makeAnimalSound();

         Animal.printAnimalName(cat);

        //create an array of Animals
        Animal[] animalsArray = {dog, cat};
        Animal.printAnimalSounds(animalsArray);

        //Create a RoboDog
        RoboDog roboDog = new RoboDog();

        //create an array of Pets
        IPet[] petsArray = {dog, cat, roboDog};
        Animal.printPetGreeting(petsArray);

//        animal2.setName("rambo");
//        System.out.println(animal2.getName());
//
//        //call or invoke methods on these objects
//        //objectName.methodName();
//        animal1.makeAnimalSound();
//        animal2.makeAnimalSound();

    }
}
