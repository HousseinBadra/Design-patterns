package FlyWeight;

import java.util.ArrayList;

class Character {
    private char symbol;  // The character itself (e.g., 'a', 'b', 'c')
    private String font;
    private int fontSize;
    private String color;
    private int x;
    private int y;

    public Character(char symbol, String font, int fontSize, String color, int x, int y) {
        this.symbol = symbol;
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Displaying '" + symbol + "' in " + font + " font, size " + fontSize + 
                           ", color " + color + " at (" + x + ", " + y + ")");
    }
}

public class NaiiveTextEditor {
    private ArrayList<Character> characters = new ArrayList<>();

    public void addCharacter(char symbol, String font, int fontSize, String color, int x, int y) {
        Character character = new Character(symbol, font, fontSize, color, x, y);
        characters.add(character);
    }

    public void displayText() {
        for (Character character : characters) {
            character.display();
        }
    }

    public static void main(String[] args) {
        NaiiveTextEditor editor = new NaiiveTextEditor();
        // Add a million characters with the same font and color
        for (int i = 0; i < 1000000; i++) {
            editor.addCharacter('a', "Arial", 12, "black", i, i);
        }
        editor.displayText();
    }
}