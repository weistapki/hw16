package org.example.task3;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {

        int[] count = new int[101];
        int result = 0;
        for (int num : nums) {
            result += count[num]++;
        }
        return result;
    }
}
