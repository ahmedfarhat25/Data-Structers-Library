package DSA.ArrayBased;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DequeueTest {

    @Test
    void addLast() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        assertEquals(2, dq.size());
        assertEquals(1, dq.getFirst());
        assertEquals(2, dq.getLast());
    }



    @Test
    void addFirst() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addFirst(1);
        dq.addFirst(2);
        assertEquals(2, dq.size());
        assertEquals(2, dq.getFirst());
    }

    @Test
    void removeFirst() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addFirst(1);
        dq.addFirst(2);
        assertEquals(2, dq.removeFirst());
        assertEquals(1, dq.size());
        assertEquals(1, dq.getFirst());
    }

    @Test
    void insert() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(3);
        dq.insert(1, 2);
        assertEquals(3, dq.size());
        assertEquals(2, dq.getIdx(1));
    }

    @Test
    void remove() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        assertEquals(2, dq.remove(1));
        assertEquals(2, dq.size());
        assertEquals(3, dq.getIdx(1));
    }

    @Test
    void isEmpty() {
        Dequeue<Integer> dq = new Dequeue<>();
        assertTrue(dq.isEmpty());
        dq.addLast(1);
        assertFalse(dq.isEmpty());
    }

    @Test
    void clear() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.clear();
        assertTrue(dq.isEmpty());
    }

    @Test
    void getFirst() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        assertEquals(1, dq.getFirst());
    }

    @Test
    void getLast() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        assertEquals(1, dq.getLast());
    }

    @Test
    void size() {
        Dequeue<Integer> dq = new Dequeue<>();
        assertEquals(0, dq.size());
        dq.addLast(1);
        dq.addLast(2);
        assertEquals(2, dq.size());
    }

    @Test
    void isValidIndex() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        assertTrue(dq.isValidIndex(0));
        assertFalse(dq.isValidIndex(1));
    }

    @Test
    void indexOf() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        assertEquals(1, dq.indexOf(2));
        assertEquals(-1, dq.indexOf(4));
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        Dequeue<Integer> clone = (Dequeue<Integer>) dq.clone();
        assertEquals(dq.size(), clone.size());
        assertEquals(dq.getFirst(), clone.getFirst());
        assertEquals(dq.getLast(), clone.getLast());
    }

    @Test
    void testToString() {
        Dequeue<Integer> dq = new Dequeue<>();
        dq.addLast(1);
        dq.addLast(2);
        assertEquals("[1, 2]", dq.toString());
    }
}
