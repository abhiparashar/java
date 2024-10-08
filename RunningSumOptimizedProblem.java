import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RunningSumOptimizedProblem {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 1, 6, -2, 7);
    List<Integer> result = new ArrayList<>(); // Use ArrayList instead of List
    result.add(nums.get(0)); // Initialize the first element in the result list

    for (int i = 1; i < nums.size(); i++) {
      result.add(result.get(i - 1) + nums.get(i)); // Compute running sum
    }

    // Print the result
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
