package DynamicArray;
import java.util.*;

public class ArrayProcedural {
    public static int size = 0;
    private static int capacity = 10;
    private static Object[] array = new Object[capacity];
// array of object to store all types of data types in an array

    public static void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size++] = data;
    }
    public static int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        ArrayProcedural.capacity = capacity;
    }


    public static void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public static void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;
                if (size <= capacity / 3) {
                    shrink();
                }
                return;
            }
        }
    }
    public static void deletefirst() {
        array[0] = null;
    }
    public static void deleteLast() {
        array[size - 1] = null;
    }
    public static int getfirstelement() {
             return (int) array[0];
    }
    public static int getlastelement() {
        return (int) array[size - 1];
    }
    public static int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public static void grow() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public static void shrink() {
        capacity /= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public static boolean isEmpty() {
        return size == 0;
    }
    public static void sort() {
        Arrays.sort(array, 0, size);
    }
    public static void clear() {
        size = 0;
        capacity = 10;
        array = new Object[capacity];
    }

    public static String display() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

}