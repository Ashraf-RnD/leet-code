package ashraf.rnd.leetcode.stringpalindrome;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = " ";
//        String s = "ace a car";

        String set =removeAllNonAlphaNumeric(s);

        System.out.println("set = " + checkPalindrome(set, set.length()));
        System.out.println("set = " + (new BigInteger("345678999999999999999").add(new BigInteger("345678999999999999999"))));


    }

    public static boolean checkPalindrome(String s, int length){

        if (s.length()==1 || s.length()==0){
            return true;
        }

        for (int i = 0; i < length/2; i++) {
            if (s.charAt(i)!=s.charAt(length-(i+1))){
                return false;
            }
        }

        return true;
    }

    public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }
}
