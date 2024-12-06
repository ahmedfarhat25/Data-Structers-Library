package StackArrayBased;

import DynamicArray.ArrayProcedural;

public class StackArrayProcedural {
    public static void push(Object data) {
        ArrayProcedural.add(data);
    }

    public static void pop() {
        ArrayProcedural.deletefirst();
    }

    public static Object top() {
        if (ArrayProcedural.getSize() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return ArrayProcedural.getlastelement();
    }

    public static int size() {
        return ArrayProcedural.getSize();
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
}
