package Decorator;

abstract class VisualComponentDecorator implements VisualComponent {
    private VisualComponent component;

    VisualComponentDecorator(VisualComponent component) {
        super();
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();

    }

    @Override
    public void resize() {
        component.resize();

    }

}