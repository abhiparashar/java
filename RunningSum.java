import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 1, 6, -2, 7);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums.get(j);
            }
            result.add(sum);
        }
        // Print results
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}