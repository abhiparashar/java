package hashmapprac;

import java.util.HashMap;;

public class FirstNonrepeating {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 2, 5 };
    // int[] arr1 = { 5, 4, 4, 7, 6, 3, 5, 6 };
    System.out.println(findFirstNonRepeatingNum(arr));
  }

  public static Integer findFirstNonRepeatingNum(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    // iterate through the map
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int count = map.get(arr[i]);
        map.put(arr[i], count + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    // check the count
    for (int num : arr) {
      if (map.get(num) == 1) {
        return num;
      }
    }
    return -1;
  }
}
