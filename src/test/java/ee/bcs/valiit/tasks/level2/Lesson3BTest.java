package ee.bcs.valiit.tasks.level2;

import ee.bcs.valiit.tasks.level2.ExtraLesson2b;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson3BTest {

    @Test
    void getSeqLength() {
        Assertions.assertEquals(1, ExtraLesson2b.getSeqLength(1));
        Assertions.assertEquals(6, ExtraLesson2b.getSeqLength(5));
        Assertions.assertEquals(4, ExtraLesson2b.getSeqLength(8));
    }

    @Test
    void nextElement() {
        Assertions.assertEquals(1, ExtraLesson2b.nextElement(2));
        Assertions.assertEquals(10, ExtraLesson2b.nextElement(3));
        Assertions.assertEquals(5, ExtraLesson2b.nextElement(10));
    }

    @Test
    void sequence3n() {
        Assertions.assertEquals(20, ExtraLesson2b.sequence3n(1, 10));
        Assertions.assertEquals(125, ExtraLesson2b.sequence3n(100, 200));
        Assertions.assertEquals(89, ExtraLesson2b.sequence3n(201, 210));
        Assertions.assertEquals(174, ExtraLesson2b.sequence3n(900, 1000));
    }
}
