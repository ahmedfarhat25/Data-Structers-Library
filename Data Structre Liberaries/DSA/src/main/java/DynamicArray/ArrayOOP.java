package DynamicArray;

import java.util.Arrays;

public class ArrayOOP {
    private int size;
    private int capacity;
    private Object[] array;

    // Default constructor with initial capacity
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
        if (size < 0 || size > capacity) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
    }

    public void setCapacity(int capacity) {
        if (capacity < size) {
            throw new IllegalArgumentException("Capacity cannot be less than size");
        }
        this.capacity = capacity;
    }

    public void addFirst(Object data) {
        add(0, data);
    }


    public void addLast(Object data) {
        add(size, data);
    }


    public void add(int index, Object data) {
        validateIndexForAdd(index);
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }


    public void insert(int index, Object data) {
        add(index, data);
    }

    public void delete(Object data) {
        int index = search(data);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
            adjustCapacity();
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

    public void deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        delete(array[0]);
    }


    public void deleteLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        array[--size] = null;
        adjustCapacity();
    }


    public Object getFirstElement() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        return array[0];
    }


    public Object getLastElement() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        return array[size - 1];
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

    // Ensures the array has enough capacity for new elements
    private void ensureCapacity() {
        if (size >= capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    // Adjusts capacity when the size drops below a threshold
    private void adjustCapacity() {
        if (size <= capacity / 3 && capacity > 10) {
            capacity /= 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    // Validates index for adding elements
    private void validateIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
