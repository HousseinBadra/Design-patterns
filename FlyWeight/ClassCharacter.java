package FlyWeight;

class Character {
    private char symbol;
    private int x;
    private int y;
    private CharacterStyle style;

    public Character(char symbol, int x, int y, CharacterStyle style) {
        this.symbol = symbol;
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void display() {
        style.display(symbol, x, y);
    }
}