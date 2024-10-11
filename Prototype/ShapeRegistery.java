package Prototype;

import java.util.HashMap;

import Prototype.classes.Circle;
import Prototype.classes.Shape;
import Prototype.classes.Square;

public class ShapeRegistery {
    private HashMap<Shapes, Shape> registery;

    ShapeRegistery() {
        this.init();
    }

    void init() {
        registery = new HashMap<>();
        registery.put(Shapes.Circle, new Circle());
        registery.put(Shapes.Square, new Square());
    }

    Shape getShape(Shapes shape) {
        return registery.get(shape).clone();
    }
}
