package mojaMapa.composition.computer;

public class PC {
    private Case myCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case myCase, Monitor monitor, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
