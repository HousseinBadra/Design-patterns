package Mediator;

abstract class DialogDirector {
    abstract void widgetChanged(Widget widged);

    abstract void showDialog();

    abstract protected void createWidgets();

    protected DialogDirector() {
    };

}
