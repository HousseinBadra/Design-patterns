package Prototype.classes;

public class Circle implements Shape {
    private Point center;
    private int radius;

    public Circle() {
        this.radius = 0;
        this.center = new Point(0, 0, 0);
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle");
    }

    public Circle clone() {
        return new Circle(this.center.clone(), this.radius);
    }
}
