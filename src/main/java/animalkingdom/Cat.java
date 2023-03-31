package animalkingdom;

public class Cat extends Feline implements IPet{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void MakeAnimalSound() {
        System.out.println("meow meow");

    }



    @Override
    public void Greetowner() {
        System.out.println("meow loudly");
    }
}
