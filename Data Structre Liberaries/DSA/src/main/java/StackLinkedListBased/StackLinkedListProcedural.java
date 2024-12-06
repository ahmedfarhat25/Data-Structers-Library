package StackLinkedListBased;
import LinkedList.LinkedListProcedural;
public class StackLinkedListProcedural {
    private static LinkedListProcedural stack = new LinkedListProcedural();
    private static int size = 0;
    public static void push(int value) {
        stack.addFirst(value); // Add to the head of the linked list
        size++;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        size--;
        return stack.deleteFirst(); // Remove from the head
    }

    public static int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst(); // Assume LinkedList has a getFirst() method
    }
    public int size(){
        return size;
    }
    public static boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void display() {
        stack.print(); // Assume LinkedList has a print() method
    }
}
