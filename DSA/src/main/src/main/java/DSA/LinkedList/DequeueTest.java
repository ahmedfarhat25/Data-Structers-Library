package DSA.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeueTest {

    private Dequeue<Integer> dequeue;

    @BeforeEach
    void setUp() {
        dequeue = new Dequeue<>();
    }

    @AfterEach
    void tearDown() {
        dequeue = null;
    }

    @Test
    void testAddFirst() {
        dequeue.addFirst(10);
        dequeue.addFirst(20);
        assertEquals(20, dequeue.getFirst());
        assertEquals(2, dequeue.size());
    }

    @Test
    void testAddLast() {
        dequeue.addLast(10);
        dequeue.addLast(20);
        assertEquals(20, dequeue.getLast());
        assertEquals(2, dequeue.size());
    }

    @Test
    void testRemoveFirst() {
        dequeue.addFirst(10);
        dequeue.addFirst(20);
        dequeue.addFirst(30);

        Integer removed = dequeue.removeFirst();
        assertEquals(30, removed);
        assertEquals(2, dequeue.size());
    }

    @Test
    void testRemoveLast() {
        dequeue.addFirst(10);
        dequeue.addFirst(20);
        dequeue.addFirst(30);

        Integer removed = dequeue.removeLast();
        assertEquals(10, removed);
        assertEquals(2, dequeue.size());
    }

    @Test
    void testGetFirst() {
        dequeue.addFirst(10);
        dequeue.addFirst(20);
        assertEquals(20, dequeue.getFirst());
    }

    @Test
    void testGetLast() {
        dequeue.addLast(10);
        dequeue.addLast(20);
        assertEquals(20, dequeue.getLast());
    }

    @Test
    void testIsEmpty() {
        assertTrue(dequeue.isEmpty());
        dequeue.addFirst(10);
        assertFalse(dequeue.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, dequeue.size());
        dequeue.addFirst(10);
        dequeue.addLast(20);
        assertEquals(2, dequeue.size());
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        dequeue.addFirst(10);
        dequeue.addLast(20);

        Dequeue<Integer> clonedDequeue = (Dequeue<Integer>) dequeue.clone();
        assertEquals(dequeue.size(), clonedDequeue.size());
        assertEquals(dequeue.toString(), clonedDequeue.toString());

        // Modify the cloned dequeue to ensure it is a deep clone
        clonedDequeue.removeFirst();
        assertNotEquals(dequeue.toString(), clonedDequeue.toString());
    }



    @Test
    void testClear() {
        dequeue.addFirst(10);
        dequeue.addLast(20);
        dequeue.addLast(30);

        dequeue.removeFirst();
        dequeue.removeLast();
        assertEquals(1, dequeue.size());
        assertEquals(20, dequeue.getFirst());

        dequeue.removeFirst();
        assertTrue(dequeue.isEmpty());
    }

    @Test
    void testToString() {
        dequeue.addFirst(10);
        dequeue.addLast(20);
        assertEquals("[10, 20]", dequeue.toString());
    }
}
