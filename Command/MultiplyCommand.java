package Command;

public class MultiplyCommand implements Command {
    private int numToMultiply = 0;

    MultiplyCommand(int numToMultiply) {
        this.numToMultiply = numToMultiply;
    }

    public double execute(double state) {
        return state * this.numToMultiply;
    }

    public double undo(double state) {
        return state / this.numToMultiply;

    }
}
