import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkQueueTest {

    private WorkQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new WorkQueue<Integer>(3);
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void getFrontElement() {
        queue.put(6);
        queue.put(7);
        assertEquals(7, queue.getFrontElement());
    }

    @Test
    void getRearElement() {
        queue.put(6);
        queue.put(7);
        assertEquals(7, queue.getRearElement());
    }

    @Test
    void remove() {
    }
}