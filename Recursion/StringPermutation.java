package Recursion;
import java.util.*;
/**
 * Input: "abc"
 * Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
 */

public class StringPermutation {
    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        Set<Character> usedChar = new HashSet<>();

        //change the value -> "abc" accordingly
        permutation("abc", result, "", usedChar);

        System.out.println(result);

        
    }

    public static void permutation(String str, List<String> result, String current, Set<Character> usedChar ){

        if(current.length() == str.length()){
            result.add(new String(current));
            return;
        }

        for(int i=0;i<str.length();i++){
            if(!usedChar.contains(str.charAt(i))){
                usedChar.add(str.charAt(i));
                current=current+str.charAt(i);
                permutation(str, result, current, usedChar);
                usedChar.remove(str.charAt(i));
                current=current.substring(0, current.length()-1);
            }
        }

    }
}
