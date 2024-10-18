package FlyWeight;

// Flyweight class to hold shared character style
class CharacterStyle {
    private String font;
    private int fontSize;
    private String color;

    public CharacterStyle(String font, int fontSize, String color) {
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    public void display(char symbol, int x, int y) {
        System.out.println("Displaying '" + symbol + "' in " + font + " font, size " + fontSize +
                           ", color " + color + " at (" + x + ", " + y + ")");
    }
}