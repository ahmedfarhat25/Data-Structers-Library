package StackLinkedListBased;
import LinkedList.LinkedListProcedural;
public class StackLinkedListOOP {
    private LinkedListProcedural stack;

    public StackLinkedListOOP() {
        stack = new LinkedListProcedural();
    }

    public void push(int value) {
        stack.addFirst(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack.deleteFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        stack.print();
    }
}
