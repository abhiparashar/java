package sort_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxChunkOfArray {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 4));
    int count = 0;

    for (int i = 0; i < arr.size(); i++) {
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();

      // Push the first `i + 1` elements into `arr1`
      for (int k = 0; k <= i; k++) {
        arr1.add(arr.get(k));
      }

      // Push the remaining elements into `arr2`
      for (int k = i + 1; k < arr.size(); k++) {
        arr2.add(arr.get(k));
      }

      // Sort both parts
      Collections.sort(arr1);
      Collections.sort(arr2);

      // Combine the sorted arrays
      ArrayList<Integer> combined = new ArrayList<>(arr1);
      combined.addAll(arr2);

      // Check if the combined array is sorted
      boolean isSorted = true;
      for (int j = 1; j < combined.size(); j++) {
        if (combined.get(j) < combined.get(j - 1)) {
          isSorted = false;
          break;
        }
      }

      // Increment the count if the combined array is sorted
      if (isSorted) {
        count++;
      }
    }

    System.out.println("Maximum chunks to sort the array: " + count);
  }
}
