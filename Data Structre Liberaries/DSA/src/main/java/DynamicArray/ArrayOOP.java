package DynamicArray;
import java.util.Arrays;

public class ArrayOOP {
    private int size;
    private int capacity;
    private Object[] array;

    public ArrayOOP() {
        this.capacity = 10;
        this.array = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void addfirst(Object data) {
        array[0] = data;
    }
    public void addlast(Object data) {
        array[size - 1] = data;
    }


    public void add(int index, Object data) {
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

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
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

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    private void grow() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }
    public void deletefirst() {
        array[0] = null;
    }
    public void deleteLast() {
        array[size - 1] = null;
    }
    public int getfirstelement() {
        return (int) array[0];
    }
    public int getlastelement() {
        return (int) array[size - 1];
    }
    private void shrink() {
        capacity /= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void clear() {
        size = 0;
        capacity = 10;
        array = new Object[capacity];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}
