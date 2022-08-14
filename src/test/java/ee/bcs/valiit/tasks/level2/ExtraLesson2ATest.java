package ee.bcs.valiit.tasks.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtraLesson2ATest {

    @Test
    void sequence3n() {
        Assertions.assertEquals(20, ExtraLesson2a.sequence3n(1, 10));
        Assertions.assertEquals(125, ExtraLesson2a.sequence3n(100, 200));
        Assertions.assertEquals(89, ExtraLesson2a.sequence3n(201, 210));
        Assertions.assertEquals(174, ExtraLesson2a.sequence3n(900, 1000));
    }
}