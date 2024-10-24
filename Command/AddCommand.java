package Command;

public class AddCommand implements Command {
    private int numToAdd = 0;

    AddCommand(int numToAdd) {
        this.numToAdd = numToAdd;
    }

    public double execute(double state) {
        return state + this.numToAdd;
    }

    public double undo(double state) {
        return state - this.numToAdd;

    }
}
