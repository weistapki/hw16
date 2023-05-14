package org.example.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void testNumJewelsInStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int expected1 = 3;
        int actual1 = jewelsAndStones.numJewelsInStones(jewels1, stones1);
        assertEquals(expected1, actual1);

        String jewels2 = "z";
        String stones2 = "ZZ";
        int expected2 = 0;
        int actual2 = jewelsAndStones.numJewelsInStones(jewels2, stones2);
        assertEquals(expected2, actual2);
    }
}

