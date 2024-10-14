package Adapter;


public class TextShape extends TextView implements Shape {

    public TextManipulator CreateManipulator() {
        return new TextManipulator();
    }

    public void BoundingBox(Point bottomLeft, Point topRight) {
        Dimensions d = new Dimensions();
        Point c = new Point(0, 0, 0);
        super.getExtend(d);
        super.getCenter(c);

        bottomLeft.setX(c.getX() - d.getWidth() / 2);
        bottomLeft.setY(c.getY() - d.getHeight() / 2);

        topRight.setX(c.getX() - d.getWidth() / 2);
        topRight.setY(c.getY() - d.getHeight() / 2);
    }
    
}
