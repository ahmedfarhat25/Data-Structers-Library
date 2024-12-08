package QueueLinkedListBase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueLinkedListBasedTest {
    private QueueLinkedListBasedOOP queue;

    @BeforeEach
    void setUp() {
        queue = new QueueLinkedListBasedOOP();
    }

    @Test
    void testEnqueueAndSize() {
        assertTrue(queue.isEmpty(), "Queue should initially be empty");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueueing elements");
        assertEquals(3, queue.size(), "Queue size should be 3");
    }

    @Test
    void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue(), "Dequeue should return the first element");
        assertEquals(2, queue.size(), "Queue size should decrease after dequeue");
        assertEquals(2, queue.dequeue(), "Dequeue should return the next element in line");
    }

    @Test
    void testFront() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.front(), "Front should return the first element");
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty(), "Queue should initially be empty");

        queue.enqueue(1);
        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueueing an element");

        queue.dequeue();
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing the last element");
    }

    @Test
    void testSearch() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertTrue(queue.search(2), "Search should return true if the element is found");
        assertFalse(queue.search(4), "Search should return false if the element is not found");
    }
}
