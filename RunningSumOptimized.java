import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RunningSumOptimized {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 6, -2, 7));
    List<Integer> result = new ArrayList<>();
    result.add(nums.get(0));
    for (int i = 1; i < nums.size(); i++) {
      result.add(result.get(i - 1) + nums.get(i));
    }

    // Print the result
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
