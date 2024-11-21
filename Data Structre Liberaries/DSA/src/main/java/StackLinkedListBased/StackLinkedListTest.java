package StackLinkedListBased;
import LinkedList.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackLinkedListTest {

    @Test
    public void testPush() {
        StackLinkedListOOP stack = new StackLinkedListOOP();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
       // assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        StackLinkedListOOP stack = new StackLinkedListOOP();
        stack.push(10);
        stack.push(20);

        int popped = stack.pop();
        assertEquals(20, popped);
        //assertEquals(1, stack.size());
    }

    @Test
    public void testIsEmpty() {
        StackLinkedListOOP stack = new StackLinkedListOOP();
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackLinkedListOOP stack = new StackLinkedListOOP();
        stack.push(10);
        assertEquals(10, stack.peek());

        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    public void testUnderflow() {
        StackLinkedListOOP stack = new StackLinkedListOOP();
        assertThrows(RuntimeException.class, stack::pop); // Should throw an exception
    }
}

