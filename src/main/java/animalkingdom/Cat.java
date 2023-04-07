package animalkingdom;

public class Cat extends Feline implements IPet{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void makeAnimalSound() {
        System.out.println("meow meow");
    }

    @Override
    public void greetOwner() {
        System.out.println("Scratch your face");
    }

}
