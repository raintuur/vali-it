package ee.bcs.valiit.tasks.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtraLesson1Test {

    @Test
    void reverseArray_evenElements() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {4, 3, 2, 1};
        int[] output = ExtraLesson1.reverseArray(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }
    @Test
    void reverseArray_oddElements() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {5, 4, 3, 2, 1};
        int[] output = ExtraLesson1.reverseArray(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }
    @Test
    void reverseArray_empty() {
        int[] input = new int[0];
        int[] output = ExtraLesson1.reverseArray(input);
        Assertions.assertArrayEquals(new int[0], output);
    }

    @Test
    void evenNumbers() {
        int[] expectedOutput = {2,4,6};
        Assertions.assertArrayEquals(expectedOutput, ExtraLesson1.evenNumbers(3));
        int[] expectedOutput2 = {2,4,6,8,10,12};
        Assertions.assertArrayEquals(expectedOutput2, ExtraLesson1.evenNumbers(6));
    }

    @Test
    void min() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(-2, ExtraLesson1.min(input));
    }

    @Test
    void max() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(5, ExtraLesson1.max(input));
    }

    @Test
    void sum() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(8, ExtraLesson1.sum(input));
    }

    @Test
    void multiplyTable() {
        // TODO
    }

    @Test
    void fibonacci() {
        Assertions.assertEquals(0, ExtraLesson1.fibonacci(0));
        Assertions.assertEquals(1, ExtraLesson1.fibonacci(1));
        Assertions.assertEquals(1, ExtraLesson1.fibonacci(2));
        Assertions.assertEquals(610, ExtraLesson1.fibonacci(15));
    }


}
