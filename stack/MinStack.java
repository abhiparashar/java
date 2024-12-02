package stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        // Constructor
    }

    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!st.isEmpty() && !minStack.isEmpty()) {
            st.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
}

class Minstack { // No public modifier here
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(1);

        System.out.println("Top element: " + minStack.top()); // Output: 1
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 1

        minStack.pop();
        System.out.println("Top element after pop: " + minStack.top()); // Output: 7
        System.out.println("Minimum element after pop: " + minStack.getMin()); // Output: 3

        minStack.pop();
        System.out.println("Top element after second pop: " + minStack.top()); // Output: 3
        System.out.println("Minimum element after second pop: " + minStack.getMin()); // Output: 3
    }
}
