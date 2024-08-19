package AbstractClassandInterface.Demo;

import java.util.Scanner;

public class Cricle implements Shape {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Mời bạn nhập vào bán kính");
        radius = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("Bán kình : %.2f | Area : %.2f | Perimeter : %.2f\n", radius, getArea(), getPerimeter());
    }
}
