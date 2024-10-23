package ChainOfResponsibility;

public class App {
    public static void main(String args[]) {
        Widget window = new Window(null, HelpType.NO_HELP_TYPE);
        Widget dialog = new Dialog(window, HelpType.NO_HELP_TYPE);
        Widget button = new Button(dialog, HelpType.NO_HELP_TYPE);

        button.handleHelp();
    }
}
