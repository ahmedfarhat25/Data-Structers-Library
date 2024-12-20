package DSA.ArrayBased;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayArrayTest {

    private ArrayArray<Integer> array;

    @BeforeEach
    void setUp() {
        array = new ArrayArray<>(); // Assuming a default constructor
    }

    @AfterEach
    void tearDown() {
        array = null;
    }



    @Test
    void getFirst() {
        array.addLast(10);
        array.addLast(20);
        assertEquals(10, array.getFirst());
    }

    @Test
    void getLast() {
        array.addLast(15);
        array.addLast(25);
        assertEquals(25, array.getLast());
    }

    @Test
    void indexOf() {
        array.addLast(5);
        array.addLast(10);
        array.addLast(15);
        assertEquals(1, array.indexOf(10));
        assertEquals(-1, array.indexOf(20));
    }

    @Test
    void isEmpty() {
        assertTrue(array.isEmpty());
        array.addLast(1);
        assertFalse(array.isEmpty());
    }

    @Test
    void testToString() {
        array.addLast(1);
        array.addLast(2);
        assertEquals("[1, 2]", array.toString());
    }

    @Test
    void addLast() {
        array.addLast(100);
        assertEquals(100, array.getLast());
    }

    @Test
    void insert() {
        array.addLast(1);
        array.addLast(3);
        array.insert(1, 2); // Assuming insert(index, value)
        assertEquals(2, array.getIdx(1));
    }

    @Test
    void remove() {
        array.addLast(10);
        array.addLast(20);
        array.addLast(30);
        array.remove(1); // Assuming remove(index)
        assertEquals(30, array.getIdx(1));
    }

    @Test
    void addFirst() {
        array.addFirst(50);
        assertEquals(50, array.getFirst());
    }

    @Test
    void removeLast() {
        array.addLast(1);
        array.addLast(2);
        array.removeLast();
        assertEquals(1, array.getLast());
    }

    @Test
    void removeFirst() {
        array.addLast(1);
        array.addLast(2);
        array.removeFirst();
        assertEquals(2, array.getFirst());
    }

    @Test
    void getIdx() {
        array.addLast(100);
        assertEquals(100, array.getIdx(0));
    }

    @Test
    void setIdx() {
        array.addLast(5);
        array.setIdx(0, 10); // Assuming setIdx(index, value)
        assertEquals(10, array.getIdx(0));
    }



    @Test
    void clear() {
        array.addLast(1);
        array.addLast(2);
        array.clear();
        assertTrue(array.isEmpty());
    }

    @Test
    void getCapacity() {
        assertTrue(array.getCapacity() > 0); // Assuming default capacity
    }

    @Test
    void iterator() {
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        assertEquals(6, sum);
    }
}
