package DSA.ArrayBased;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest{

    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @AfterEach
    void tearDown() {
        queue = null; // Cleanup
    }

    @Test
    void enqueue() {
        queue.enqueue(10);
        assertEquals(1, queue.size());
        queue.enqueue(20);
        assertEquals(2, queue.size());
    }

    @Test
    void dequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.dequeue());
        assertEquals(1, queue.size());
    }

    @Test
    void peek() {
        queue.enqueue(10);
        assertEquals(10, queue.peek());
        queue.enqueue(20);
        assertEquals(10, queue.peek()); // Peeking still returns the front element
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, queue.size());
        queue.enqueue(10);
        assertEquals(1, queue.size());
    }


    @Test
    void testToString() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals("[10, 20]", queue.toString());
    }

}
