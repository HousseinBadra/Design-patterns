package Command;

import java.util.ArrayList;

public class Calculator {
    private double state = 0;
    private ArrayList<Command> commands = new ArrayList<>();

    void execute(Command c) {
        this.state = c.execute(this.state);
        commands.add(c);
    }

    void undo() {
        if (commands.size() == 0)
            return;
        Command tail = commands.get(commands.size() - 1);
        this.state = tail.undo(this.state);
        commands.remove(commands.size() - 1);
    }

    void currentState() {
        System.out.println(this.state);
    }
}
