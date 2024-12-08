package recursion;

import java.util.*;

public class PrintDescring {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        dec(n);
        scn.close();

    }

    public static void dec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        dec(n - 1);
    }
}
