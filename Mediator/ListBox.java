package Mediator;

import java.util.ArrayList;

public class ListBox extends Widget {
    ListBox(DialogDirector mediator) {
        super(mediator);
    }

    String GetSelection() {
        return "Selection";
    };

    void SetList(ArrayList<String> listltems) {
    };

    void handleMouseEvent() {
    }

}
