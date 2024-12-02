package stack;

import java.util.Stack;

public class RemoveAdjacent {
    public static void main(String[] args) {
        String str = "abccbde";
        String result = removeAdjacentVal(str);
        System.out.println(result);
    }

    public static String removeAdjacentVal(String str) {
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
        // this is inserting in array in reverse
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        // creating a string
        return new String(arr);
    }
}
