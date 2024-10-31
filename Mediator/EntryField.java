package Mediator;

public class EntryField extends Widget {
    EntryField(DialogDirector mediator) {
        super(mediator);
    }

    void SetText(final String text) {
    };

    String GetText() {
        return "Text";
    };

    void handleMouseEvent() {
    }

}
