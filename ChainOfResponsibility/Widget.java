package ChainOfResponsibility;

public class Widget implements HelpHandler {
    Widget() {

    }

    Widget(Widget ancestor, HelpType type) {
        this.ancestor = ancestor;
        this.topic = type;
    }

    public void handleHelp() {
        if (this.ancestor != null) {
            ancestor.handleHelp();
        }
        else {
            System.out.println("No help");
        }
    }

    public boolean hasHelp() {
        return topic != HelpType.NO_HELP_TYPE;
    }

    private Widget ancestor = null;
    private HelpType topic = HelpType.NO_HELP_TYPE;

}
