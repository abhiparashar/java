package recursion;

public class Sum {
    public static void main(String[] args) {
        int k = 100;
        int sum = sumOfElem(k);
        System.out.println(sum);
    }

    public static int sumOfElem(int k) {
        // base case
        if (k == 1)
            return k;
        int ans = sumOfElem(k - 1);
        return k + ans;
    }
}
