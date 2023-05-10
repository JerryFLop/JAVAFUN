package pcbuild;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor(new Resolution(50, 50), "HP24m", "HP");
        TheCase theCase = new TheCase("Windows xp", "Microsoft", "220 volts",new Dimension(200, 200, 100));
        Motherboard motherboard = new Motherboard("sony23", "Sony",2,3,"sony-bios");
        Pc pc = new Pc(theCase,motherboard,monitor);
        System.out.println(pc);
        pc.powerUp();
    }
}
