package animalkingdom;

public class Dog extends Canine implements IPet{
    public Dog(String name, String breed) {
        super(name, breed);
    }
    @Override
    public void MakeAnimalSound(){
        System.out.println("woof woof");

    }

    @Override
    public void Greetowner() {
        System.out.println(" wag tail and lick face");

    }
}
