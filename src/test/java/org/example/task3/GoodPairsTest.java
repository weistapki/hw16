package org.example.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodPairsTest {
    @Test
    public void testNumIdenticalPairs() {

        GoodPairs goodPairs = new GoodPairs();

        int[] nums1 = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3,4,5,6};

        assertEquals(4, goodPairs.numIdenticalPairs(nums1));
        assertEquals(6, goodPairs.numIdenticalPairs(nums2));
        assertEquals(0, goodPairs.numIdenticalPairs(nums3));
    }

}
