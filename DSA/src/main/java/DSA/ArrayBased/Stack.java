package DSA.ArrayBased;

import DSA.Interfaces.StackInterface;

public class Stack<T> implements Cloneable, StackInterface<T> {
    private ArrayArray<T> stack;

    public Stack() {
        stack = new ArrayArray<>();
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

    @Override
    @SuppressWarnings("unchecked")
    public Object clone() throws CloneNotSupportedException {
        Stack<T> stackClone = (Stack<T>) super.clone();
        stackClone.stack = (ArrayArray<T>) this.stack.clone();
        return stackClone;
    }

    public int size(){
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
