package StackArrayBased;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackArrayTest {

    @Test
    public void testPush() {
        StackArrayOOP stack = new StackArrayOOP(5); // Stack size is 5
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        StackArrayOOP stack = new StackArrayOOP(5);
        stack.push(10);
        stack.push(20);

        int popped = stack.pop();
        assertEquals(20, popped);
        assertEquals(1, stack.size());
    }

    @Test
    public void testIsEmpty() {
        StackArrayOOP stack = new StackArrayOOP(5);
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackArrayOOP stack = new StackArrayOOP(5);
        stack.push(10);
        assertEquals(10, stack.peek());

        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    public void testOverflow() {
        StackArrayOOP stack = new StackArrayOOP(2);
        stack.push(10);
        stack.push(20);

        assertThrows(RuntimeException.class, () -> stack.push(30)); // Should throw an exception
    }

    @Test
    public void testUnderflow() {
        StackArrayOOP stack = new StackArrayOOP(5);
        assertThrows(RuntimeException.class, stack::pop); // Should throw an exception
    }
}
