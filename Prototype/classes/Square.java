package Prototype.classes;

public class Square implements Shape {
    private Point center;
    private int sideLength;
    private int orientation;

    public Square() {
        this.sideLength = 0;
        this.center = new Point(0, 0, 0);
        this.orientation = 0;
    }

    public Square(Point center, int sideLength, int orientation) {
        this.center = center;
        this.sideLength = sideLength;
        this.orientation = orientation;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void draw() {
        System.out.println("Drawing square");
    }

    public Square clone() {
        return new Square(this.center.clone(), this.sideLength, this.orientation);
    }
}
