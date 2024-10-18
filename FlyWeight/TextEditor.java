package FlyWeight;

import java.util.ArrayList;

public class TextEditor {
    private ArrayList<Character> characters = new ArrayList<>();

    public void addCharacter(char symbol, int x, int y, String font, int fontSize, String color) {
        CharacterStyle style = CharacterStyleFactory.getStyle(font, fontSize, color);  // Shared style
        Character character = new Character(symbol, x, y, style);  // Unique state (x, y)
        characters.add(character);
    }

    public void displayText() {
        for (Character character : characters) {
            character.display();
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        // Add a million characters with the same font and color
        for (int i = 0; i < 100000; i++) {
            editor.addCharacter('a', i, i, "Arial", 12, "black");
        }
        editor.displayText();
    }
}