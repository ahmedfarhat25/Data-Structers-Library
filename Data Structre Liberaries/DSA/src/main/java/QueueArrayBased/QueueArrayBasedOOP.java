package QueueArrayBased;
import DynamicArray.ArrayOOP;
public class QueueArrayBasedOOP {
    private ArrayOOP array;

    public QueueArrayBasedOOP() {
        array = new ArrayOOP();
    }

    public void enqueue(Object value) {
        array.addfirst(value);
    }

    public Object dequeue() {
        Object firstElement = array.getfirstelement();
        array.deletefirst();
        return firstElement;
    }

    public Object front() {
        return array.getfirstelement();
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
