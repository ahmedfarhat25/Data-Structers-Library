package QueueArrayBased;
import DynamicArray.ArrayOOP;
public class QueueArrayBasedOOP {
    private ArrayOOP array;

    public QueueArrayBasedOOP() {
        array = new ArrayOOP();
    }

    public void enqueue(Object value) {
        array.addFirst(value);
    }

    public Object dequeue() {
        Object firstElement = array.getFirstElement();
        array.deleteFirst();
        return firstElement;
    }

    public Object front() {
        return array.getFirstElement();
    }

    public boolean isEmpty() {
        return array.getSize() == 0;
    }
    public int search(Object data){
        return array.search(data);
    }
    public void display() {
        array.display();
    }
    public int size() {
        return array.getSize();
    }
    public void emplace(int index, Object data) {
        array.insert(index, data);
    }
    public void remove(Object data) {
        array.delete(data);
    }
    public void clear() {
        array.clear();
    }
}
