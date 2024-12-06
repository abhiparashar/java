package heap;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
  PriorityQueue<Integer> smallBlock; // max-heap
  PriorityQueue<Integer> largeBlock; // min-heap

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public MedianFinder() {
    largeBlock = new PriorityQueue();
    smallBlock = new PriorityQueue(Collections.reverseOrder());
  }

  public void addNum(int num) {
    if (smallBlock.size() == largeBlock.size()) {
      largeBlock.add(num);
      smallBlock.add(largeBlock.remove());
    } else {
      smallBlock.add(num);
      largeBlock.add(smallBlock.remove());
    }
  }

  public double findMedian() {
    if (smallBlock.size() == largeBlock.size()) {
      return (smallBlock.peek() + largeBlock.peek()) / 2.0;
    } else {
      return smallBlock.peek();
    }
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */