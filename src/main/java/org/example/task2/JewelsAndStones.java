package org.example.task2;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int[] frequency = new int[128];
        for (char stone : stones.toCharArray()) {
            frequency[stone]++;
        }
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            count += frequency[jewel];
        }
        return count;
    }
}
