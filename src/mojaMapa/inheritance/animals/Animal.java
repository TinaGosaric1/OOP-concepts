package mojaMapa.inheritance.animals;

public class Animal {
    private String name;
    private int body;
    private double weight;

    public Animal(String name, int body, double weight) { //constructor
        this.name = name;
        this.body = body;
        this.weight = weight;
    }

    public void move(int speed){
        System.out.println(name + " is moving at " + speed + ".");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public double getWeight() {
        return weight;
    }
}
