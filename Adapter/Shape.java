package Adapter;

interface Shape {
    void BoundingBox(Point bottomLeft, Point topRight);
    TextManipulator CreateManipulator();
}