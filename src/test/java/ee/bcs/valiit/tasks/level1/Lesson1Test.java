package ee.bcs.valiit.tasks.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson1Test {

    @Test
    void invertPositiveNegative() {
        assertEquals(-2, Lesson1.invertPositiveNegative(2));
        assertEquals(0, Lesson1.invertPositiveNegative(0));
        assertEquals(9, Lesson1.invertPositiveNegative(-9));
    }

    @Test
    void getAverage() {
        assertEquals(2, Lesson1.getAverage(1, 3));
        assertEquals(0, Lesson1.getAverage(-1, 1));
        assertEquals(10, Lesson1.getAverage(0, 20));
    }

    @Test
    void minus5Times99() {
        assertEquals(-990, Lesson1.minus5Times99(-5));
        assertEquals(-495, Lesson1.minus5Times99(0));
        assertEquals(0, Lesson1.minus5Times99(5));
    }

    @Test
    void multiplyPairsAndGetTotalSum() {
        assertEquals(41, Lesson1.multiplyPairsAndGetTotalSum(1, 3, 2, 4, 5, 6));
        assertEquals(-12, Lesson1.multiplyPairsAndGetTotalSum(-5, 9, 2, 18, 1, -3));
    }

    @Test
    void isLeapYear() {
        assertEquals(true, Lesson1.isLeapYear(1984));
    }

    @Test
    void invertBoolean() {
        assertTrue(Lesson1.invertBoolean(false));
        assertFalse(Lesson1.invertBoolean(true));
    }

    @Test
    void oneBooleanIsTrue() {
        assertTrue(Lesson1.oneBooleanIsTrue(true, false));
        assertTrue(Lesson1.oneBooleanIsTrue(false, true));
        assertFalse(Lesson1.oneBooleanIsTrue(true, true));
        assertFalse(Lesson1.oneBooleanIsTrue(false, false));
    }

    @Test
    void oddNumberOfTrueBooleans() {
        assertTrue(Lesson1.oddNumberOfTrueBooleans(true, false, false, false));
        assertTrue(Lesson1.oddNumberOfTrueBooleans(false, true, false, false));
        assertFalse(Lesson1.oddNumberOfTrueBooleans(true, true, true, true));
        assertFalse(Lesson1.oddNumberOfTrueBooleans(false, false, false, false));
        assertTrue(Lesson1.oddNumberOfTrueBooleans(true, true, true, false));
        assertTrue(Lesson1.oddNumberOfTrueBooleans(false, true, true, true));
        assertFalse(Lesson1.oddNumberOfTrueBooleans(true, true, false, false));
        assertFalse(Lesson1.oddNumberOfTrueBooleans(false, false, true, true));
    }

}