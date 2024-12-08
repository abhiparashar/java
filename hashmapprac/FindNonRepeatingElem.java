package hashmapprac;

import java.util.HashMap;

public class FindNonRepeatingElem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 5 };
        int ans = FirstNonrepeating(arr);
        System.out.println(ans);
    }

    public static int FirstNonrepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int temp = map.get(arr[i]);
                map.put(arr[i], temp + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // check the count
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
