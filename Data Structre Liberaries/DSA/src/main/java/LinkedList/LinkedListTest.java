package LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

public class LinkedListTest {
    private LinkedListWithReverse list;

    @BeforeEach
    public void setUp() {
        list = new LinkedListWithReverse();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(1);
        assertEquals(1, list.getFirst());
        list.addFirst(2);
        assertEquals(2, list.getFirst());
    }

    @Test
    public void testAddLast() {
        list.addLast(1);
        assertEquals(1, list.getFirst());
        list.addLast(2);
        assertEquals(1, list.getFirst());
        assertEquals(2, list.tail.val);
    }

    @Test
    public void testAddAtPosition() {
        list.addFirst(1);
        list.addLast(3);
        list.add(1, 2);
        assertEquals(1, list.head.val);
        assertEquals(2, list.head.next.val);
        assertEquals(3, list.tail.val);
    }

    @Test
    public void testDeleteFirst() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.deleteFirst());
        assertEquals(1, list.getFirst());
        list.deleteFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDeleteLast() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(1, list.deleteLast());
        assertEquals(2, list.getFirst());
        list.deleteLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testDeleteAtPosition() {
        list.addFirst(1);
        list.addLast(3);
        list.add(1, 2);
        assertEquals(2, list.delete(1));
        assertEquals(1, list.head.val);
        assertEquals(3, list.tail.val);
    }

    @Test
    public void testSearch() {
        list.addFirst(1);
        list.addLast(2);
        assertTrue(list.search(1));
        assertTrue(list.search(2));
        assertFalse(list.search(3));
    }

    @Test
    public void testPrint() {
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.print(); // Output should be: 1 2 3
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addLast(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testSort() {
        list.addFirst(3);
        list.addFirst(1);
        list.addLast(2);
        list.sort();
        assertEquals(1, list.head.val);
        assertEquals(2, list.head.next.val);
    }

    @Test
    public void testReverse() {
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.reverse();
        assertEquals(3, list.head.val);
        assertEquals(2, list.head.next.val);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.addFirst(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGetFirst() {
        list.addFirst(1);
        assertEquals(1, list.getFirst());
        list.addFirst(2);
        assertEquals(2, list.getFirst());
    }

    @Test
    public void testDeleteFirstException() {
        assertThrows(NoSuchElementException.class, () -> {
            list.deleteFirst();
        });
    }

    @Test
    public void testDeleteLastException() {
        assertThrows(NoSuchElementException.class, () -> {
            list.deleteLast();
        });
    }
}
