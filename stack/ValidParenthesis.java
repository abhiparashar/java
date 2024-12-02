package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "]{]}";
        boolean ans = isValidParenthesis(str);
        System.out.println(ans);
    }

    public static boolean isValidParenthesis(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.empty()) {
                st.push(str.charAt(i));
                continue;
            }
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else {
                if (str.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (str.charAt(i) == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }
}
