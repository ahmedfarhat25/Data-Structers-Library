package DynamicArray;
import java.util.*;

public class ArrayProcedural {
    public static int size = 0;
    private static int capacity = 10;
    private static Object[] array = new Object[capacity];

    public static void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size++] = data;
    }

    public static void addFirst(Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = data;
        size++;
    }

    public static void addLast(Object data) {
        add(data);
    }

    public static int getSize() {
        return size;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void insert(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
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

    public static void deleteFirst() {
        if (size == 0) return;
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        if (size <= capacity / 3) {
            shrink();
        }
    }

    public static void deleteLast() {
        if (size == 0) return;
        array[--size] = null;
        if (size <= capacity / 3) {
            shrink();
        }
    }

    public static Object getFirstElement() {
        if (size == 0) throw new NoSuchElementException("Array is empty");
        return array[0];
    }

    public static Object getLastElement() {
        if (size == 0) throw new NoSuchElementException("Array is empty");
        return array[size - 1];
    }

    public static int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    private static void grow() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    private static void shrink() {
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

    @Override
    public String toString() {
        return display();
    }
}
