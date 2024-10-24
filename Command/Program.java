package Command;

public class Program {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.execute(new AddCommand(1));
        c.currentState();
        c.execute(new MultiplyCommand(5));
        c.currentState();
        c.undo();
        c.currentState();
        c.undo();
        c.currentState();
    }
}
