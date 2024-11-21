package StackArrayBased;

public class StackArrayOOP {
    private int[] stack;
    private int top;

    public StackArrayOOP(int maxSize) {
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
