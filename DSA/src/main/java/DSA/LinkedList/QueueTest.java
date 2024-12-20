package DSA.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    void testEnqueue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.peek()); // First element should be 10
        assertEquals(3, queue.size());  // Queue size should be 3
    }

    @Test
    void testDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        Integer removed = queue.dequeue();
        assertEquals(10, removed); // First element (10) should be removed
        assertEquals(2, queue.size()); // Queue size should be 2
    }

    @Test
    void testPeek() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.peek()); // First element should be 10
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty()); // Queue should be empty initially
        queue.enqueue(10);
        assertFalse(queue.isEmpty()); // Queue should not be empty after adding an element
    }

    @Test
    void testSize() {
        assertEquals(0, queue.size()); // Size should be 0 initially
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2, queue.size()); // Size should be 2 after enqueueing two elements
    }

    @Test
    void testToString() {
        queue.enqueue(10);
        assertEquals("[10]", queue.toString()); // Queue should print its elements correctly
    }

    @Test
    void testDequeueEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> queue.dequeue()); // Dequeue from empty queue should throw exception
    }

    @Test
    void testPeekEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> queue.peek()); // Peek on empty queue should throw exception
    }
}
