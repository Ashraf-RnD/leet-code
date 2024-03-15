package ashraf.rnd.leetcode.validanagram;

import java.util.Arrays;

/*
* 242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

* */

public class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char [] first = s.toCharArray();
        Arrays.sort(first);
        char [] second = t.toCharArray();
        Arrays.sort(second);

        for(int i =0;i<first.length;i++){
            if(first[i]!=second[i]){
                return false;
            }
        }

        return true;

    }
}
