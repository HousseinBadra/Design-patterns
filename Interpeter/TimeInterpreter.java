package Interpeter;
import java.util.ArrayList;
import java.util.List;


// Client class to use the interpreter pattern
public class TimeInterpreter {
    public static int interpretTimeExpression(String expression) {
        Context context = new Context(expression);

        // List of expressions to interpret
        List<TimeExpression> expressions = new ArrayList<>();
        expressions.add(new HoursExpression());
        expressions.add(new MinutesExpression());
        expressions.add(new SecondsExpression());

        // Sum the results of each interpretation
        int totalSeconds = 0;
        for (TimeExpression expr : expressions) {
            totalSeconds += expr.interpret(context);
        }

        return totalSeconds;
    }

    public static void main(String[] args) {
        String timeStr = "2 hours 30 minutes 15 seconds";
        int parsedTime = interpretTimeExpression(timeStr);
        System.out.println("Total seconds for '" + timeStr + "': " + parsedTime);
    }
}
