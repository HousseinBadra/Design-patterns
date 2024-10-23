package ChainOfResponsibility;

public class Window extends Widget {
    Window(Widget ancestor, HelpType type) {
        super(ancestor, type);
    }
    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Help on Window level");
            return;
        }
        super.handleHelp();
    }
}