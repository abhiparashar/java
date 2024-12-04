package queue;

import java.util.LinkedList;
import java.util.Queue;

public class KthNumber {
  public static void main(String[] args) {
    int k = 7;
    String ans = findKthNumber(k);
    System.out.println(ans);
  }

  public static String findKthNumber(int k) {
    Queue<String> q = new LinkedList<>();
    String str = "";
    if (q.isEmpty()) {
      q.add("1");
      q.add("2");
    }
    // insert into queue
    for (int i = 1; i <= k; i++) {
      String temp = q.remove();
      str = temp;
      q.add(temp + "1");
      q.add(temp + "2");
    }
    return str;
  }
}
