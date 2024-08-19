package AbstractClassandInterface.EX4;

public class Cricle extends Shape{
    private double radius;

    public Cricle() {
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Cricle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
