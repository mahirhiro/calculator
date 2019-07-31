package Model;

import java.util.Stack;
import java.util.StringTokenizer;

public class Expressions {

    public Expressions() {

    }

    public double make(String expression) {
        //remove white space and add evaluation operator
        expression = expression.replaceAll("[\t\n ]", "") + "=";
        String operator = "*/+-=";
        //split up the operators from the values
        StringTokenizer tokenizer = new StringTokenizer(expression, operator, true);
        Stack<String> operatorStack = new Stack<>();
        Stack<String> valueStack = new Stack<>();
        while (tokenizer.hasMoreTokens()) {
            //add the next token to the proper stack
            String token = tokenizer.nextToken();
            if (!operator.contains(token))
                valueStack.push(token);
            else
                operatorStack.push(token);
            //perform any pending operations
            resolve(valueStack, operatorStack);
        }
        //return the top of the value stack
        String lastOne = valueStack.pop();
        return Double.parseDouble(lastOne);
    }

    private int getPriority(String op) {
        switch (op) {
            case "*":
            case "/":
                return 1;
            case "+":
            case "-":
                return 2;
            case "=":
                return 3;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private void resolve(Stack<String> values,
                         Stack<String> operators) {
        while (operators.size() >= 2) {
            String first = operators.pop();
            String second = operators.pop();
            if (getPriority(first) < getPriority(second)) {
                operators.push(second);
                operators.push(first);
                return;
            } else {
                String firstValue = values.pop();
                String secondValue = values.pop();
                values.push(getResults(secondValue, second, firstValue));
                operators.push(first);
            }
        }
    }

    private String getResults(String operand1, String operator, String operand2) {
        System.out.println("Performing " +
                operand1 + operator + operand2);
        double op1 = Double.parseDouble(operand1);
        double op2 = Double.parseDouble(operand2);
        switch (operator) {
            case "*":
                return "" + (op1 * op2);
            case "/":
                return "" + (op1 / op2);
            case "+":
                return "" + (op1 + op2);
            case "-":
                return "" + (op1 - op2);
            default:
                return null;
        }
    }
}

