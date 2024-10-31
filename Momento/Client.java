package Momento;

public class Client {
    private TextEditor vsCode = new TextEditor();
    private CareTaker<String> history = new CareTaker<String>();

    void type(String word) {
        this.vsCode.type(word);
        this.history.add(this.vsCode.save());
    }

    void undo() {
        this.vsCode.restore(history.getState(0));
    }
}
