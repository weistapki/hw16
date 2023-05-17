package org.example.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalloonTest {
    @Test
    public void testMaxNumberOfBalloons() {
        Balloon balloon = new Balloon();
        String text1 = "nlaebolko";
        int expected1 = 1;
        int result1 = balloon.maxNumberOfBalloons(text1);
        assertEquals(expected1, result1);

        String text2 = "loonbalxballpoon";
        int expected2 = 2;
        int result2 = balloon.maxNumberOfBalloons(text2);
        assertEquals(expected2, result2);

        String text3 = "ballllllllllllllooonnnn";
        int expected3 = 1;
        int result3 = balloon.maxNumberOfBalloons(text3);
        assertEquals(expected3, result3);

        String text4 = "balon";
        int expected4 = 0;
        int result4 = balloon.maxNumberOfBalloons(text4);
        assertEquals(expected4, result4);
    }
}
