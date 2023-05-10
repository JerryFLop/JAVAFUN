package pcbuild;

public class Pc {
    private TheCase thecase;
    private Motherboard motherboard;
     private Monitor monitor ;

    public Pc(TheCase thecase, Motherboard motherboard, Monitor monitor) {
        this.thecase = thecase;
        this.motherboard = motherboard;
        this.monitor = monitor;

    }
    public TheCase getCase() {
        return thecase;
    }
    public void setCase(TheCase Case) {
       this.thecase = Case;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    private void drawLogo(){
         monitor.drawPixel(10,10,"purple");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" );

    }
     public void powerUp(){
       thecase.pressPowerButton();
       drawLogo();
       motherboard.loadProgram("Photoshop");

       }


    @Override
    public String toString() {
        description();
        return  monitor +
                "\n" + thecase +
                "\n" + motherboard +
                '}';
    }



}
