package DSA.LinkedList;

import DSA.Interfaces.DequeueInterface;

public class Dequeue<T> implements Cloneable, DequeueInterface<T> {
    LinkedArray<T> list;

    public Dequeue() {
        list = new LinkedArray<>();
    }

    public void addFirst(T t) {
        list.addFirst(t);
    }

    public void addLast(T t) {
        list.addLast(t);
    }

    public T removeFirst() {
        return list.removeFirst();
    }

    public T removeLast() {
        return list.removeLast();
    }

    public T getFirst() {
        return list.getFirst();
    }

    public T getLast() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object clone() throws CloneNotSupportedException {
        Dequeue<T> clone = (Dequeue<T>) super.clone();
        clone.list = (LinkedArray<T>) list.clone();
        return clone;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
