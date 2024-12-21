package DSA.LinkedList;

import DSA.Interfaces.QueueInterface;

public class Queue<T> implements QueueInterface<T> {
    LinkedArray<T> queue;

    public Queue() {
        queue = new LinkedArray<>();
    }

    @Override
    public void enqueue(T t) {
        queue.addLast(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    @Override
    public T peek() {
        // Check if queue is empty and throw IllegalStateException if it is
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }
    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
