package Decorator;

public class BorderDecorator extends VisualComponentDecorator {
    private int width;

    BorderDecorator(VisualComponent component, int width) {
        super(component);
        this.width = width;
    }

    private void drawBorder(int width) {

    }

    @Override
    public void draw() {
        super.draw();
        drawBorder(this.width);
    }
}
