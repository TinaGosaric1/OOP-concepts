package mojaMapa.inheritance.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    //1st constructor
    public Rectangle() {
        this(0,0); //calls 2nd constructor
    }

    //2nd constructor
    public Rectangle(int x, int y) {
        this(x,y,0,0); //calls 3rd constructor
    }

    //3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x,y); //calls constructor from parent class
        this.width = width;
        this.height = height;
    }
}

