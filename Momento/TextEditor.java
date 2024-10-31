package Momento;

public class TextEditor {
    private StringBuilder content = new StringBuilder();

    void type(String word) {
        this.content.append(word);
    }

    public String getContent() {
        return this.content.toString();
    }

    public Momento<String> save() {
        return new Momento<String>(this.getContent());
    }

    public void restore(Momento<String> momento) {
        this.content = new StringBuilder(momento.getState());
    }

}
