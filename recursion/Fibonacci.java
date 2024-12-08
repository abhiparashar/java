package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int ans = findFibonacci(n);
        System.out.println(ans);
    }

    public static int findFibonacci(int n) {
        // base condition
        if (n == 0 || n == 1)
            return n;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
