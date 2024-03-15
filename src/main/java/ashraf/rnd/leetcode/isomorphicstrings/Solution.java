package ashraf.rnd.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println("isIsomorphic = " + isIsomorphic(s,t));
    }

    //Wrong answer
    public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();for (int i = 0; i < s.length() ; i++) {
            if(charMap.containsKey(s.charAt(i)) && !charMap.get(s.charAt(i)).equals(t.charAt(i)) ){
                return false;
            }else{
                charMap.put(s.charAt(i),t.charAt(i));
            }
        }

        return true;
    }
}
