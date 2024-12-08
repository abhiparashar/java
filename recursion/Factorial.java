package recursion;

public class Factorial {
    public static void main(String[] args) {
        int k = 6;
        int sum = findFact(k);
        System.out.println(sum);
    }

    public static int findFact(int k) {
        // base case
        if (k == 1)
            return 1;
        return k * findFact(k - 1);
    }
}
