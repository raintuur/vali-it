package ee.bcs.valiit.tasks.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Lesson3Test {

    @Test
    void sampleArray() {
        int[] answer = Lesson3.sampleArray();
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, answer);
    }

    @Test
    void generateArray() {
        int[] answer1 = Lesson3.generateArray(0);
        int[] expected1 = {};
        assertArrayEquals(expected1, answer1);
        int[] answer2 = Lesson3.generateArray(6);
        int[] expected2 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected2, answer2);
    }

    @Test
    void arrayOfThrees() {
        int[] answer1 = Lesson3.arrayOfThrees(0);
        int[] expected1 = {};
        assertArrayEquals(expected1, answer1);
        int[] answer2 = Lesson3.arrayOfThrees(3);
        int[] expected2 = {3, 3, 3};
        assertArrayEquals(expected2, answer2);
        int[] answer3 = Lesson3.arrayOfThrees(6);
        int[] expected3 = {3, 3, 3, 3, 3, 3};
        assertArrayEquals(answer3, expected3);
    }


    @Test
    void doubleAllElementValues() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{2, 8, 12, 4, 8, 2};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{8, 6, 2, 106, 4, 110};
        Lesson3.doubleAllElementValues(a);
        Lesson3.doubleAllElementValues(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void secondElementToZero() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{1, 0, 6, 2, 4, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 0, 1, 53, 2, 55};
        Lesson3.secondElementToZero(a);
        Lesson3.secondElementToZero(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void swapFirstAndSecondElement() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{4, 1, 6, 2, 4, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{3, 4, 1, 53, 2, 55};
        Lesson3.swapFirstAndSecondElement(a);
        Lesson3.swapFirstAndSecondElement(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void firstElementToSameAsFirst() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] aAnswer = new int[]{1, 1, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 4, 1, 53, 2, 55};
        Lesson3.firstElementToSameAsFirst(a);
        Lesson3.firstElementToSameAsFirst(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void changeRequiredElements() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] aAnswer = new int[]{1, 1, 6, 6, 4, 4, 5, 5, 7, 1, 8, 1};
        Lesson3.changeRequiredElements(a);
        assertArrayEquals(aAnswer, a);
    }

    @Test
    void changeEvenElementsToPreviousElementValues() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1, 1};
        int[] aAnswer = new int[]{1, 1, 6, 6, 4, 4, 5, 5, 7, 7, 8, 8, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 4, 1, 1, 2, 2};
        Lesson3.changeEvenElementsToPreviousElementValues(a);
        Lesson3.changeEvenElementsToPreviousElementValues(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }
}
