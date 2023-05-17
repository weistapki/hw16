package org.example.task1;

public class Balloon {
    // Method for determining the maximum number of "balloon" words in the text string
    public int maxNumberOfBalloons(String text) {
        // Creating an array charCounts of size 26 to store the count of each character in the string
        int[] charCounts = new int[26];

        for (char currentChar : text.toCharArray()) {
            charCounts[currentChar - 'a']++;
        }
        // Calculating the minimum count of "balloon" words in the string
        int minCount = Math.min(charCounts['b'-'a'], Math.min(charCounts['a'-'a'], Math.min(charCounts['l'-'a']/2, Math.min(charCounts['o'-'a']/2, charCounts['n'-'a']))));
        return minCount;
    }
}
