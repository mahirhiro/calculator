package Model;

import java.util.Stack;

public class Expressions {

    static int decider;
    static char checker;
    static Node root = null;
    String joinedString;
    String postfix = "";
    Stack<Node> stack = new Stack<Node>();
    Stack<NodeInt> intStack = new Stack<NodeInt>();
    private String[] tokens;
    private String s;
    private char[] c;

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public char[] getC() {
        return c;
    }

    //constructor
    public void Expressions() {
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = null;
        }
    }

    private boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
            return true;
        return false;
    }

    /**
     * Checks if c2 has same or higher precedence than c1
     *
     * @param c1 first operator
     * @param c2 second operator
     * @return true if c2 has same or higher precedence
     */
    private boolean checkPrecedence(char c1, char c2) {
        if ((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
            return true;
        else if ((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else if ((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else
            return false;
    }

    /**
     * Converts infix expression to postfix
     *
     * @param infix infix expression to be converted
     * @return postfix expression
     */
    public String make(String infix) {
        System.out.printf("%-8s%-10s%-15s\n", "Input", "Stack", "Postfix");
        //equivalent postfix is empty initially
        Stack<Character> s = new Stack();  //stack to hold symbols
        s.push('#');  //symbol to denote end of stack

        System.out.printf("%-8s%-10s%-15s\n", "", format(s.toString()), postfix);

        for (int i = 0; i < infix.length(); i++) {
            char inputSymbol = infix.charAt(i);  //symbol to be processed
            if (isOperator(inputSymbol)) {  //if a operator
                //repeatedly pops if stack top has same or higher precedence
                while (checkPrecedence(inputSymbol, s.peek()))
                    postfix += s.pop();
                s.push(inputSymbol);
            } else if (inputSymbol == '(')
                s.push(inputSymbol);  //push if left parenthesis
            else if (inputSymbol == ')') {
                //repeatedly pops if right parenthesis until left parenthesis is found
                while (s.peek() != '(')
                    postfix += s.pop();
                s.pop();
            } else
                postfix += inputSymbol;
            System.out.printf("%-8s%-10s%-15s\n", "" + inputSymbol, format(s.toString()), postfix);
        }

        //pops all elements of stack left
        while (s.peek() != '#') {
            postfix += s.pop();
            System.out.printf("%-8s%-10s%-15s\n", "", format(s.toString()), postfix);

        }
        return postfix;

    }

    /**
     * Formats the input  stack string
     *
     * @param s It is a stack converted to string
     * @return formatted input
     */
    private String format(String s) {
        s = s.replaceAll(",", "");  //removes all , in stack string
        s = s.replaceAll(" ", "");  //removes all spaces in stack string
        s = s.substring(1, s.length() - 1);  //removes [] from stack string

        return s;
    }

    public char[] convertArrayToChar(String strArray) {
        joinedString = String.join(" ", strArray);
        System.out.println("EX:" + joinedString);
        c = joinedString.toCharArray();
        return c;
    }

    public double postflixConvertToBinaryTree() {
        for (int i = 0; i < c.length; i++) {
            Node node = new Node(c[i]);
            switch (c[i]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    stack.push(node);
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    node.right = stack.pop();
                    node.left = stack.pop();
                    stack.push(node);
                    break;
                default:
            }
        }
        root = stack.pop();

        for (int i = 0; i < c.length; i++) {
            NodeInt nodeInt = new NodeInt(0);
            switch (c[i]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    nodeInt = new NodeInt(Character.getNumericValue(c[i]));
                    intStack.push(nodeInt);
                    break;
                case '+':
                    double x = intStack.pop().data;
                    double y = intStack.pop().data;
                    nodeInt.data = x + y;
                    intStack.push(nodeInt);
                    break;
                case '-':
                    x = intStack.pop().data;
                    y = intStack.pop().data;
                    nodeInt.data = y - x;
                    intStack.push(nodeInt);
                    break;
                case '/':
                    x = intStack.pop().data;
                    y = intStack.pop().data;
                    nodeInt.data = y / x;
                    intStack.push(nodeInt);
                    break;
                case '*':
                    x = intStack.pop().data;
                    y = intStack.pop().data;
                    nodeInt.data = y * x;
                    intStack.push(nodeInt);
                    break;
                default:
            }

        }
        return intStack.pop().data;


    }

}

