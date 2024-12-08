package StackArrayBased;

import DynamicArray.ArrayOOP;

public class StackArrayOOP {
    private ArrayOOP array;

    public StackArrayOOP() {
        array = new ArrayOOP();
    }

    public void push(int  value) {
        array.addLast(value);
    }

    public Object pop() {
        Object lastElement = array.getLastElement();
        array.deleteLast();
        return lastElement;
    }

    public Object top() {
        return array.getLastElement();
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
}
