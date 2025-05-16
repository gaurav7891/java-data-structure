package com.nativeworks.datastructures.string;


/*
 The problem "Longest Substring with K Unique Characters" requires
 us to find the longest substring in a given string that contains exactly K distinct characters.

 e.g. Given a string s and an integer K, find the length of the longest substring that contains exactly K unique characters.
 s = "aabacbebebe"
 K = 3

 output: 7
 The substring "cbebebe" is the longest substring with exactly 3 unique characters

 */


// How to solve this?
/*
 Sliding Window technique + HashMap

 Algo:
 1. Use two pointers left and right to form a window
 2. Expand right to include characters in the window until we have more than K unique characters.
 3. If the number of unique characters exceeds K, shrink the window by moving left until we have exactly K unique characters.
 4. Keep track of the maximum length of a valid substring.

 */

import java.util.HashMap;

public class LongestSubStringWithUniqueChar {

    public static int longestSubStringKUnique(String s, int k) {
        if (s == null || s.isEmpty() || k == 0) return 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add character at right to the map
            hashMap.put(s.charAt(right), hashMap.getOrDefault(s.charAt(right), 0) + 1);

            // shrink window if more than k unique characters
            if (hashMap.size() > k) {
                char leftChar = s.charAt(left);
                hashMap.put(leftChar, hashMap.get(leftChar) - 1);
                if (hashMap.get(leftChar) == 0) {
                    hashMap.remove(leftChar);
                }
                left++; // move left pointer
            }

            // update max length if exactly K unique characters
            if (hashMap.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println(hashMap);
        return maxLen;
    }

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 4;
        System.out.println(longestSubStringKUnique(s, k));

    }
}
