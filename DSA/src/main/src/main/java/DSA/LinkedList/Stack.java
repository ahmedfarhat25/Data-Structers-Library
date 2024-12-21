package DSA.LinkedList;

import DSA.Interfaces.StackInterface;

public class Stack<T> implements Cloneable, StackInterface<T> {

    private LinkedArray<T> stack;

    public Stack() {
        stack = new LinkedArray<>();
    }

    @Override
    public void push(T t) {
        stack.addLast(t);
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public T peek() {
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object clone() throws CloneNotSupportedException {
        Stack<T> stackClone = (Stack<T>) super.clone();
        stackClone.stack = stack.clone();
        return stackClone;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
