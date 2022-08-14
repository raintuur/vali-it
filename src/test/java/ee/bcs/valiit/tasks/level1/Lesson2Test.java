package ee.bcs.valiit.tasks.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson2Test {

    @Test
    void min() {
        assertEquals(2, Lesson2.min(2, 3));
        assertEquals(-3, Lesson2.min(2, -3));
        assertEquals(-3, Lesson2.min(-3, -3));
    }

    @Test
    void max() {
        assertEquals(3, Lesson2.max(2, 3));
        assertEquals(2, Lesson2.max(2, -3));
        assertEquals(-3, Lesson2.min(-3, -3));

    }

    @Test
    void min3() {
        assertEquals(2, Lesson2.min3(2, 3, 4));
        assertEquals(2, Lesson2.min3(2, 2, 4));
        assertEquals(2, Lesson2.min3(2, 4, 4));
        assertEquals(2, Lesson2.min3(3, 2, 4));
        assertEquals(1, Lesson2.min3(1, 2, 4));
        assertEquals(-5, Lesson2.min3(1, 2, -5));
    }

    @Test
    void max3() {
        assertEquals(4, Lesson2.max3(2, 3, 4));
        assertEquals(4, Lesson2.max3(3, 3, 4));
        assertEquals(4, Lesson2.max3(2, 4, 4));
        assertEquals(4, Lesson2.max3(3, 2, 4));
        assertEquals(4, Lesson2.max3(4, 2, 4));
    }


    @Test
    void abs() {
        assertEquals(2, Lesson2.abs(2));
        assertEquals(2, Lesson2.abs(-2));
    }

    @Test
    void isEven() {
        assertTrue(Lesson2.isEven(-4));
        assertFalse(Lesson2.isEven(3));
    }
}
