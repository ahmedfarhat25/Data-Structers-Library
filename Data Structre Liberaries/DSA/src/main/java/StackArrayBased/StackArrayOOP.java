package StackArrayBased;

import DynamicArray.ArrayOOP;

public class StackArrayOOP {
    private ArrayOOP array;

    public StackArrayOOP() {
        array = new ArrayOOP();
    }

    public void push(Object value) {
        array.add(value);
    }

    public Object pop() {
        Object lastElement = array.getlastelement();
        array.deleteLast();
        return lastElement;
    }

    public Object top() {
        return array.getlastelement();
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
