package hashmapprac;

import java.util.HashMap;

public class FrequencyCount {
  public static void main(String[] args) {
    int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
    int[] freqArr = { 2, 8, 3, 5 };
    HashMap<Integer, Integer> map = new HashMap<>();
    // insert in map
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int count = map.get(arr[i]);
        map.put(arr[i], count + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    // get the count
    for (int i = 0; i < freqArr.length; i++) {
      System.out.println(freqArr[i] + "-->" + map.getOrDefault(freqArr[i], 0));
    }
  }
}