package stack;

import java.util.Stack;

public class RemoveAdjacentPrac {
    public static void main(String[] args) {
        String str = "abcccbde";
        String ans = removeSimilarElement(str);
        System.out.println(ans);
    }

    public static String removeSimilarElement(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.empty()) {
                st.push(str.charAt(i));
                continue;
            }
            if (st.peek() == str.charAt(i)) {
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }
        char[] arr = new char[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return new String(arr);
    }
}
