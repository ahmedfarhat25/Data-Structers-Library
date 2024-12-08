package DynamicArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayUnitTest{

    @Test
    public void testAdd() {
        ArrayOOP dynamicArray = new ArrayOOP();
        dynamicArray.add(0, "A");
        dynamicArray.add(1, "B");

        assertEquals("[A, B]", dynamicArray.toString());
        assertEquals(2, dynamicArray.getSize());
    }

    @Test
    public void testInsert() {
        ArrayOOP dynamicArray = new ArrayOOP();
        dynamicArray.add(0, "A");
        dynamicArray.add(1, "B");
        dynamicArray.add(2, "C");

        dynamicArray.insert(1, "D");
        assertEquals("[A, D, B, C]", dynamicArray.toString());
        assertEquals(4, dynamicArray.getSize());
    }

    @Test
    public void testDelete() {
        ArrayOOP dynamicArray = new ArrayOOP();
        dynamicArray.add(0, "A");
        dynamicArray.add(1, "B");
        dynamicArray.add(2, "C");

        dynamicArray.delete("B");
        assertEquals("[A, C]", dynamicArray.toString());
        assertEquals(2, dynamicArray.getSize());
    }

    @Test
    public void testSearch() {
        ArrayOOP dynamicArray = new ArrayOOP();
        dynamicArray.add(0, "A");
        dynamicArray.add(1, "B");
        dynamicArray.add(2, "C");

        assertEquals(1, dynamicArray.search("B"));
        assertEquals(-1, dynamicArray.search("D"));
    }

    @Test
    public void testGrow() {
        ArrayOOP dynamicArray = new ArrayOOP();
        for (int i = 0; i < 15; i++) {
            dynamicArray.add(i, i);
        }

        assertTrue(dynamicArray.getCapacity() >= 15);
        assertEquals(15, dynamicArray.getSize());
    }

    @Test
    public void testShrink() {
        ArrayOOP dynamicArray = new ArrayOOP();

        for (int i = 0; i < 15; i++) {
            dynamicArray.add(i, i);
        }

        for (int i = 0; i < 12; i++) {
            dynamicArray.delete(i);
        }

        assertTrue(dynamicArray.getCapacity() < 15); // Should have shrunk
        assertEquals(3, dynamicArray.getSize());
    }

    @Test
    public void testIsEmpty() {
        ArrayOOP dynamicArray = new ArrayOOP();
        assertTrue(dynamicArray.isEmpty());

        dynamicArray.add(0, "A");
        assertFalse(dynamicArray.isEmpty());
    }

    @Test
    public void testToString() {
        ArrayOOP dynamicArray = new ArrayOOP();
        dynamicArray.add(0, "A");
        dynamicArray.add(1, "B");

        assertEquals("[A, B]", dynamicArray.toString());
    }
}
