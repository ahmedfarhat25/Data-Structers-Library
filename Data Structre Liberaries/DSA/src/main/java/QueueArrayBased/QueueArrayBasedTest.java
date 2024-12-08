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
            }

            @Test
            void testDequeue() {
                queue.enqueue("First");
                queue.enqueue("Second");
                queue.enqueue("Third");
            }

            @Test
            void testFront() {
                queue.enqueue("First");
                queue.enqueue("Second");

            }

            @Test
            void testIsEmpty() {
                assertTrue(queue.isEmpty(), "Queue should initially be empty");

                queue.enqueue("First");

            }

            @Test
            void testSearch() {
                queue.enqueue("A");
                queue.enqueue("B");
                queue.enqueue("C");

            }

            @Test
            void testEmplace() {
                queue.enqueue("A");
                queue.enqueue("C");
                queue.emplace(1, "B");

            }

            @Test
            void testRemove() {
                queue.enqueue("A");
                queue.enqueue("B");
                queue.enqueue("C");

                queue.remove("B");
            }

            @Test
            void testDisplay() {
                queue.enqueue("A");
                queue.enqueue("B");
                queue.enqueue("C");

                // No assertion since display outputs to the console
                queue.display();
            }

            @Test
            void testClear() {
                queue.enqueue("A");
                queue.enqueue("B");
                queue.enqueue("C");

                queue.clear();
                assertTrue(queue.isEmpty(), "Queue should be empty after clear");
                assertEquals(0, queue.size(), "Queue size should be 0 after clear");
            }


}
