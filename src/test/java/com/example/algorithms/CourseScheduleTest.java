package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    @Test
    void testCanFinishTrue() {
        assertTrue(CourseSchedule.canFinish(2, new int[][]{{1,0}}));
    }

    @Test
    void testCanFinishFalse() {
        assertFalse(CourseSchedule.canFinish(2, new int[][]{{1,0},{0,1}}));
    }

    @Test
    void testCanFinishInvalid() {
        assertThrows(IllegalArgumentException.class, () -> CourseSchedule.canFinish(-1, new int[][]{{}}));
    }
}
