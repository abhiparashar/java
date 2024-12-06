package heap;

import java.util.Collections;
import java.util.PriorityQueue;

class KthSmallest {
  public static int kthSmallestElem(int[] arr, int k) {
    // max heap
    @SuppressWarnings({ "rawtypes", "unchecked" })
    PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    for (int i = 0; i < k; i++) {
      pq.add(arr[i]);
    }
    for (int i = k; i < arr.length; i++) {
      if (pq.peek() > arr[i]) {
        pq.remove();
        pq.add(arr[i]);
      }
    }
    return pq.peek();
  }
}