package Command;

interface Command {
    double execute(double state);
    double undo(double state);
}
