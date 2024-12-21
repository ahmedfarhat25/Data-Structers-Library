package DSA.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedArrayTest {

    private LinkedArray<Integer> linkedArray;

    @BeforeEach
    void setUp() {
        linkedArray = new LinkedArray<>();
    }

    @AfterEach
    void tearDown() {
        linkedArray = null;
    }

    @Test
    void testRemoveFirst() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        linkedArray.addFirst(30);

        Integer removed = linkedArray.remove(0);
        assertEquals(30, removed);
        assertEquals(2, linkedArray.size());
    }

    @Test
    void testRemoveLast() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        linkedArray.addFirst(30);

        Integer removed = linkedArray.remove(2);  // Removing the last element
        assertEquals(10, removed);
        assertEquals(2, linkedArray.size());
    }

    @Test
    void testRemoveMiddle() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        linkedArray.addFirst(30);

        Integer removed = linkedArray.remove(1);  // Removing the middle element
        assertEquals(20, removed);
        assertEquals(2, linkedArray.size());
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        linkedArray.addFirst(10);
        linkedArray.addLast(20);
        linkedArray.addLast(30);

        LinkedArray<Integer> clonedList = linkedArray.clone();
        assertEquals(linkedArray.size(), clonedList.size());
        assertEquals(linkedArray.toString(), clonedList.toString());

        // Modify the cloned list to ensure it is a deep clone
        clonedList.remove(0);
        assertNotEquals(linkedArray.toString(), clonedList.toString());
    }

    @Test
    void testRemoveFromEmptyList() {
        assertThrows(IllegalCallerException.class, () -> linkedArray.remove(0));
    }

    @Test
    void testCloneEmptyList() throws CloneNotSupportedException {
        LinkedArray<Integer> clonedList = linkedArray.clone();
        assertTrue(clonedList.isEmpty());
    }

    @Test
    void testSizeAfterMultipleRemovals() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        linkedArray.addFirst(30);
        linkedArray.remove(0);
        linkedArray.remove(0);

        assertEquals(1, linkedArray.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(linkedArray.isEmpty());
        linkedArray.addFirst(10);
        assertFalse(linkedArray.isEmpty());
    }

    @Test
    void testAddFirst() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        assertEquals(20, linkedArray.getFirst());
        assertEquals(2, linkedArray.size());
    }

    @Test
    void testAddLast() {
        linkedArray.addLast(10);
        linkedArray.addLast(20);
        assertEquals(20, linkedArray.getLast());
        assertEquals(2, linkedArray.size());
    }

    @Test
    void testClear() {
        linkedArray.addFirst(10);
        linkedArray.addLast(20);
        linkedArray.clear();
        assertTrue(linkedArray.isEmpty());
        assertEquals(0, linkedArray.size());
    }

    @Test
    void testAddRemoveConsistency() {
        linkedArray.addFirst(10);
        linkedArray.addFirst(20);
        linkedArray.remove(0);
        assertEquals(10, linkedArray.getFirst());
        assertEquals(1, linkedArray.size());
    }
}
