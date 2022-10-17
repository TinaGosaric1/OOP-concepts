package mojaMapa.composition.room;

public class Bedroom {
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Bed bed, Lamp lamp) {
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;

    }
}
