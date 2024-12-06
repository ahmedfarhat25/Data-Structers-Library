package QueueArrayBased;
import DynamicArray.ArrayProcedural;
public class QueueArrayBasedProcedural {
    public static void enqueue(Object value) {
        ArrayProcedural.add(value);
    }

    public static Object dequeue() {
        Object firstElement = ArrayProcedural.getfirstelement();
        ArrayProcedural.deletefirst();
        return firstElement;
    }

    public static Object front() {
        return ArrayProcedural.getfirstelement();
    }
    public static Object back() {
        return ArrayProcedural.getlastelement();
    }

    public static boolean isEmpty() {
        return ArrayProcedural.getSize() == 0;
    }
    public static int search(Object data){
        return ArrayProcedural.search(data);
    }
    public static void display() {
        ArrayProcedural.display();
    }
    public static int size() {
        return ArrayProcedural.getSize();
    }
    public static void emplace(int index, Object data) {
        ArrayProcedural.insert(index, data);
    }
    public static void remove(Object data) {
        ArrayProcedural.delete(data);
    }
}

