package ee.bcs.valiit.tasks.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLesson3Test {

    @Test
    void factorial() {
        assertEquals(120, ExtraLesson3.factorial(5));
        assertEquals(1, ExtraLesson3.factorial(1));
        assertEquals(5040, ExtraLesson3.factorial(7));
    }

    @Test
    void reverseString() {
        assertEquals("eret", ExtraLesson3.reverseString("tere"));
        assertEquals("eReT", ExtraLesson3.reverseString("TeRe"));
        assertEquals("", ExtraLesson3.reverseString(""));
        assertEquals("A", ExtraLesson3.reverseString("A"));
    }

    @Test
    void isPrime() {
        assertTrue(ExtraLesson3.isPrime(2));
        assertTrue(ExtraLesson3.isPrime(937));
        assertFalse(ExtraLesson3.isPrime(217));
        assertFalse(ExtraLesson3.isPrime(1));
    }

    @Test
    void sort() {
        int[] x = new int[]{6, 2, 7, 3, 1};
        int[] expectedResult = new int[]{1, 2, 3, 6, 7};
        assertArrayEquals(expectedResult, ExtraLesson3.sort(x));
        assertArrayEquals(new int[0], new int[0]);
        assertArrayEquals(new int[1], new int[1]);
    }

    @Test
    void evenFibonacci() {
        assertEquals(10, ExtraLesson3.evenFibonacci(10));
        assertEquals(10, ExtraLesson3.evenFibonacci(20));
        assertEquals(44, ExtraLesson3.evenFibonacci(40));
    }

    @Test
    void morseCode() {
        assertEquals(".... . .-.. .-.. ---", ExtraLesson3.morseCode("hello"));
        assertEquals("... --- ...", ExtraLesson3.morseCode("sos"));
    }
}
