package Adapter;

public class test {
    public static void main(String args[]){
        TextShape a = new TextShape();
        Point b = new Point(0,0,0);
        a.BoundingBox(b, b);

        System.out.println(b.getX());
    }
}
