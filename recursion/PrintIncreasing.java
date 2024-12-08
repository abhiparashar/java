package recursion;

public class PrintIncreasing {
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        // base case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
}
