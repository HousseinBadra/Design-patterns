package ChainOfResponsibility;

public class Button extends Widget {
    Button(Widget ancestor, HelpType type) {
        super(ancestor, type);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Help on button level");
            return;
        }
        super.handleHelp();
    }
}
