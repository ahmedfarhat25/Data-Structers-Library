package QueueLinkedListBase;
import LinkedList.LinkedListProcedural;
public class QueueLinkedListBasedProcedural {
    private static LinkedListProcedural linkedList = new LinkedListProcedural();

    public static void enqueue(int data) {
        linkedList.addLast(data);
    }

    public static int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        }
        return linkedList.deleteFirst();
    }

    public static int top() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return linkedList.getFirst();
    }

    public static boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public static void display() {
        linkedList.print();
    }
    public static int size(){
        return linkedList.size();
    }
    public static boolean search(int data){
        return linkedList.search(data);
    }
    public void emplace(int index, int data) {
        linkedList.add(index, data);
    }
    public void remove(int data) {
        linkedList.delete(data);
    }
}
