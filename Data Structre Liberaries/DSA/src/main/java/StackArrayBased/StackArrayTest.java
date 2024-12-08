package StackArrayBased;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackArrayTest {

    @Test
    public void testPush() {
        StackArrayOOP stack = new StackArrayOOP();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.top());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        StackArrayOOP stack = new StackArrayOOP();
        stack.push(10);
        stack.push(20);

        Object popped = stack.pop();
        assertEquals(20, popped);
        assertEquals(1, stack.size());
    }

    @Test
    public void testIsEmpty() {
        StackArrayOOP stack = new StackArrayOOP();
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackArrayOOP stack = new StackArrayOOP();
        stack.push(10);
        assertEquals(10, stack.top());

        stack.push(20);
        assertEquals(20, stack.top());
    }

    @Test
    public void testSize() {
        StackArrayOOP stack = new StackArrayOOP();
        assertEquals(0, stack.size());

        stack.push(10);
        assertEquals(1, stack.size());

        stack.push(20);
        assertEquals(2, stack.size());
        stack.pop();

    }

    @Test
    public void testDynamicGrowth() {
        StackArrayOOP stack = new StackArrayOOP();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        assertEquals(15, stack.size());
        assertEquals(14, stack.top());
    }

    @Test
    public void testUnderflow() {
        StackArrayOOP stack = new StackArrayOOP();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testDisplay() {
        StackArrayOOP stack = new StackArrayOOP();
        stack.push(10);
        stack.push(20);

        stack.display(); // Verify the output manually in console: 20 10
    }
}
