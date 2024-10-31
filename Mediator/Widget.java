package Mediator;

public abstract class Widget {
    private DialogDirector meidator;

    Widget(DialogDirector mediator) {
        this.meidator = mediator;
    }

    void changed() {
        this.meidator.widgetChanged(this);
    }

    abstract void handleMouseEvent();
}
