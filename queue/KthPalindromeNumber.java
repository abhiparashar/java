package queue;

import java.util.LinkedList;
import java.util.Queue;

public class KthPalindromeNumber {
  public static void main(String[] args) {
    int k = 4;
    findKthPalindromeNumber(k);
  }

  public static void findKthPalindromeNumber(int k) {
    Queue<String> q = new LinkedList<>();
    String ans = "";
    if (q.isEmpty()) {
      q.add("11");
      q.add("22");
    }
    for (int i = 1; i <= k; i++) {
      String temp = q.remove();
      ans = temp;
      String left = temp.substring(0, temp.length() / 2);
      String right = temp.substring(temp.length() / 2, temp.length());
      q.add(left + "11" + right);
      q.add(left + "22" + right);
    }
    System.out.println(ans);
  }
}
