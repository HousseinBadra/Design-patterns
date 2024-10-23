package ChainOfResponsibility;

public class Dialog extends Widget {
    Dialog(Widget ancestor, HelpType type) {
        super(ancestor, type);
    }
    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Help on dialog level");
            return;
        }
        super.handleHelp();
    }
}