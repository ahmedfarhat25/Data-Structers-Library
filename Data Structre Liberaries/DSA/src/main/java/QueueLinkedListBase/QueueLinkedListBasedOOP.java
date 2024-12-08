package QueueLinkedListBase;
import LinkedList.LinkedListOOP;
public class QueueLinkedListBasedOOP {
    private LinkedListOOP linkedList = new LinkedListOOP();

    public void enqueue(int data) {
        linkedList.addLast(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        }
        return linkedList.deleteFirst();
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return linkedList.getFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void display() {
        linkedList.print();
    }
    public int size(){
        return linkedList.size();
    }
    public boolean search(int data){
        return linkedList.search(data);
    }
    public void emplace(int index, int data) {
        linkedList.add(index, data);
    }
    public void remove(int data) {
        linkedList.delete(data);
    }
    public int front(){
        return linkedList.getFirst();
    }
    public int back(){
        return linkedList.getback();
    }
    
}
