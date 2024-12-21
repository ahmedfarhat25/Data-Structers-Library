package DSA.Abstract;

import java.util.Iterator;

import DSA.Interfaces.RandomAccess;

public abstract class AbstractArray<T> implements RandomAccess<T> {

    protected int size;

    protected static <T> void copyArray(T[] source, T[] dest, int n) {
        System.arraycopy(source, 0, dest, 0, n);
    }

    protected AbstractArray(int size) {
        this.size = size;
    }

    public abstract Iterator<T> iterator();

    public abstract T getIdx(int index);

    public abstract void setIdx(int index, T value);

    public abstract void addFirst(T value);

    public abstract void addLast(T value);

    public abstract T removeFirst();

    public abstract T removeLast();

    public abstract T remove(int index);

    public abstract void clear();

    public abstract void insert(int idx, T data);

    public boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getFirst() {
        if (size == 0) {
            throw new IllegalCallerException("Array is Empty");
        }
        return getIdx(0);
    }

    @Override
    public T getLast() {
        if (size == 0) {
            throw new IllegalCallerException("Array is Empty");
        }
        return getIdx(size - 1);
    }


    @Override
    public int indexOf(T value) {
        Iterator<T> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> iterator = iterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next().toString()).append(", ");
        }

        sb.delete(sb.length() - 1, sb.length());
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
}
