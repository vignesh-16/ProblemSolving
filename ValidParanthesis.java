/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 */

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "({[})]";
        String validity = isValid(s) ? "Valid!" : "Not valid!";
        System.out.println("The given paranthesis ' "+s+" is "+validity);
    };
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            boolean stackEmpty = st.empty();
            if (stackEmpty) {
                st.push(c);
            } else {
                if (c =='}' && st.peek()=='{') {
                    st.pop();
                } else if (c==')' && st.peek()=='(') {
                    st.pop();
                } else if (c==']' && st.peek()=='[') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        }
        return st.empty();
    }
}
