package Interpeter;
// Context class to hold and parse the input string
class Context {
    private String expression;
    private String[] tokens;

    public Context(String expression) {
        this.expression = expression.toLowerCase();
        this.tokens = this.expression.split(" ");
    }

    public String getToken(int index) {
        if (index >= 0 && index < tokens.length) {
            return tokens[index];
        }
        return null;
    }

    public String[] getTokens() {
        return tokens;
    }
}

// Expression interface defining the interpret method
interface TimeExpression {
    int interpret(Context context);
}

// Concrete expression for hours
class HoursExpression implements TimeExpression {
    @Override
    public int interpret(Context context) {
        for (int i = 0; i < context.getTokens().length; i++) {
            if (context.getTokens()[i].contains("hour")) {
                try {
                    int hours = Integer.parseInt(context.getToken(i - 1));
                    return hours * 3600;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    return 0;
                }
            }
        }
        return 0;
    }
}

// Concrete expression for minutes
class MinutesExpression implements TimeExpression {
    @Override
    public int interpret(Context context) {
        for (int i = 0; i < context.getTokens().length; i++) {
            if (context.getTokens()[i].contains("minute")) {
                try {
                    int minutes = Integer.parseInt(context.getToken(i - 1));
                    return minutes * 60;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    return 0;
                }
            }
        }
        return 0;
    }
}

// Concrete expression for seconds
class SecondsExpression implements TimeExpression {
    @Override
    public int interpret(Context context) {
        for (int i = 0; i < context.getTokens().length; i++) {
            if (context.getTokens()[i].contains("second")) {
                try {
                    int seconds = Integer.parseInt(context.getToken(i - 1));
                    return seconds;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    return 0;
                }
            }
        }
        return 0;
    }
}