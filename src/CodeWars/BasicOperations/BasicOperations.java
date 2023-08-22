package CodeWars.BasicOperations;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                if (v2 != 0) {
                    return v1 / v2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }
}
