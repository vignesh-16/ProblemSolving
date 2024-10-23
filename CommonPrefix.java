// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

 

// Constraints:

//     1 <= strs.length <= 200
//     0 <= strs[i].length <= 200
//     strs[i] consists of only lowercase English letters.
import java.util.*;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String commonPrefix = longestCommonPrefix(arr);
        System.out.println("Longest commong prefix is: "+commonPrefix);
    };
    public static String longestCommonPrefix(String[] strs) {
        String compare = strs[0];
        String answer = compare;
         for (int i=1; i<strs.length; i++) {
             String curr = strs[i];
             if (curr.length() < answer.length()) {
                 answer = answer.substring(0, curr.length());
                 compare = compare.substring(0, curr.length());
             }
             for (int index=0; index<curr.length() && index<compare.length(); index++) {
                 if ((compare.charAt(index)) != (curr.charAt(index))) {
                     answer = compare.substring(0, index);
                     compare = compare.substring(0, index);
                     break;
                 }
             }
        }
         return answer;
    };
}
