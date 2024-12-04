package queue;

import java.util.Stack;

public class QueueUsingStack {
  public static void main(String[] args) {
    Stack<Integer> st1 = new Stack<>();
    int[] arr = { 5, 4, 7, 9, 8, 10, 14 };
    for (int i = 0; i < arr.length; i++) {
      st1.push(arr[i]);
    }
    int ans = getElement(st1);
    System.out.println(ans);
  }

  public static int getElement(Stack<Integer> st1) {
    int size = st1.size();
    Stack<Integer> st2 = new Stack<>();

    // Transfer all but the last element to st2
    for (int i = 0; i < size - 1; i++) {
      st2.push(st1.pop());
    }

    // Get the element to return (the last element in the original stack)
    int ans = st1.pop();

    // Transfer elements back to st1
    while (!st2.isEmpty()) {
      st1.push(st2.pop());
    }

    // Push the returned element back to st1
    st1.push(ans);

    return ans;
  }
}