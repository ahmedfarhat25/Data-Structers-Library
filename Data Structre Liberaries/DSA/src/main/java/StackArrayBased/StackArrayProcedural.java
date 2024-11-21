package StackArrayBased;

public class StackArrayProcedural {
    private static final int MAX_SIZE = 100;
    private static int[] stack = new int[MAX_SIZE];
    private static int top = -1;

    public static void push(int value) {
        if (top == MAX_SIZE - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = value;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public static int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void display() {
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
