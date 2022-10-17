package mojaMapa.inheritance.animals;

public class Dog extends Animal { //parent class Animal, subclass Dog
    private int legs;
    private String coat;

    public Dog(String name, double weight, int legs, String coat) {
        super(name, 1, weight); //we call the constructor from the parent class Animal
        this.legs = legs;
        this.coat = coat;
    }

    @Override
    public void move(int speed) { //we override the method move() from the parent class
        super.move(speed); //here we take all the functionality from the parent class (not necessary in general)
        System.out.println("Eli is the best."); //this message will only show if we call the method move() from the subclass
    }

    public void walk(){
        move(5); //we call the method move() from the subclass
    }

    public void run(){
        super.move(10); //we call the method move() from the parent class (not recommended)
    }
}