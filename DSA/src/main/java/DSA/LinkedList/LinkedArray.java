package DSA.LinkedList;


import DSA.Abstract.AbstractLinkedArray;

public class LinkedArray<T> extends AbstractLinkedArray<T> implements Iterable<T>, Cloneable {


    public LinkedArray() {
        super(0);
        head = null;
        tail = null;
    }

    @Override
    public T remove(int index) {
        if (head == null) {
            throw new IllegalCallerException("linked list is empty");
        } else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();

        Node<T> targetNode = getIdxNode(index);
        T data = targetNode.data;
        --size;
        return data;
    }

    @SuppressWarnings("unchecked")
    @Override
    public LinkedArray<T> clone() throws CloneNotSupportedException {
        LinkedArray<T> list = (LinkedArray<T>) super.clone();
        list.clear();

        for (T data : this) {
            list.addLast(data);
        }
        return list;
    }
}
