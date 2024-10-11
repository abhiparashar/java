import java.util.Arrays;

public class querySum_unoptimized {
  public static void main(String[] args) {
    int[] vec = { -2, 5, 1, 3, 4, 1, 7, -8, 2, 0 };
    int[][] queries = { { 3, 8 }, { 2, 4 }, { 0, 3 }, { 5, 9 }, { 6, 6 } };
    calculateSum(vec, queries);
  }

  public static void calculateSum(int[] vec, int[][] queries) {
    int[] temp = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int l = queries[i][0];
      int r = queries[i][1];
      int sum = 0;
      for (int j = l; j <= r; j++) {
        sum += vec[j];
      }
      temp[i] = sum;
    }
    System.out.println(Arrays.toString(temp));
  }
}