package LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    public void testAddFirst() {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        assertTrue(list.search(10));  // Check if 10 is in the list
        assertTrue(list.search(20));  // Check if 20 is in the list
    }

    @Test
    public void testDeleteFirst() {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        assertEquals(20, list.deleteFirst());  // Should return the first value
        assertTrue(list.search(10));  // Check if 10 is still in the list
    }

    @Test
    public void testDeleteLast() {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        assertEquals(20, list.deleteLast());  // Should remove 20
    }

    @Test(expected = RuntimeException.class)
    public void testDeleteEmptyList() {
        LinkedList list = new LinkedList();
        list.deleteFirst();  // Should throw exception
    }
}
