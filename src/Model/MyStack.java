package Model;

public class MyStack {
    private int top;
    private String[] stackArray;

    //Constructor
    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Your Capacity is Wrong! ");
        } else {
            stackArray = new String[capacity];
            top = -1;
        }

    }

    public void push(String value) {
        if (top != stackArray.length - 1) {
            top++;
            stackArray[top] = value;
        } else
            System.out.println("Stack is Full");

    }

    public void pop() {
        if (top == -1) {
            System.out.print("Stack is Empty");
        } else {
            top--;
        }
    }

    public String peek() {
        if (!isEmpty())
            return stackArray[top];
        else
            return "Stack is Empty";
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

}


