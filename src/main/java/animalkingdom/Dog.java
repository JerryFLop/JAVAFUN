package animalkingdom;

public class Dog extends Canine implements IPet{
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void makeAnimalSound() {
        System.out.println("woof woof");
    }


    @Override
    public void greetOwner() {
        System.out.println("Wag tail , and lick your face");

    }
}
