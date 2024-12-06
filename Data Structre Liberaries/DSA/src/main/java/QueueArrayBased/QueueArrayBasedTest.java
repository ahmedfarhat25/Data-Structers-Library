package QueueArrayBased;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueArrayBasedTest {

    private QueueArrayBasedOOP queue;

    @BeforeEach
    void setUp() {
        queue = new QueueArrayBasedOOP();
    }

    @Test
    void testEnqueueAndSize() {
        assertTrue(queue.isEmpty(), "Queue should initially be empty");
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueueing elements");
        assertEquals(3, queue.size(), "Queue size should be 3");
    }

    @Test
    void testDequeue() {
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        assertEquals("First", queue.dequeue(), "Dequeue should return the first element");
        assertEquals(2, queue.size(), "Queue size should decrease after dequeue");
        assertEquals("Second", queue.dequeue(), "Dequeue should return the next element in line");
    }

    @Test
    void testFront() {
        queue.enqueue("First");
        queue.enqueue("Second");

        assertEquals("First", queue.front(), "Front should return the first element without removing it");
        assertEquals(2, queue.size(), "Queue size should remain the same after calling front");
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty(), "Queue should initially be empty");

        queue.enqueue("First");
        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueueing an element");

        queue.dequeue();
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing the last element");
    }

    @Test
    void testSearch() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        assertEquals(0, queue.search("A"), "Search should return 0 for the first element");
        assertEquals(1, queue.search("B"), "Search should return 1 for the second element");
        assertEquals(-1, queue.search("D"), "Search should return -1 for an element not in the queue");
    }

    @Test
    void testEmplace() {
        queue.enqueue("A");
        queue.enqueue("C");
        queue.emplace(1, "B");

        assertEquals(3, queue.size(), "Queue size should increase after emplace");
        assertEquals("B", queue.dequeue(), "Dequeue should return the newly emplaced element in order");
    }

    @Test
    void testRemove() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.remove("B");
        assertEquals(2, queue.size(), "Queue size should decrease after removing an element");
        assertEquals("A", queue.dequeue(), "Remaining elements should still be dequeued in order");
        assertEquals("C", queue.dequeue(), "Remaining elements should still be dequeued in order");
    }

    @Test
    void testDisplay() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        // No assertion since display outputs to the console
        queue.display();
    }
}
