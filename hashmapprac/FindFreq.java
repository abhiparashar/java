package hashmapprac;

import java.util.HashMap;

public class FindFreq {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int[] freqArr = { 2, 8, 3, 5 };
        HashMap<Integer, Integer> ans = findFreq(arr, freqArr);
        // get the count
        for (int elem : freqArr) {
            System.out.println(elem + "->" + ans.getOrDefault(elem, 0));
        }
    }

    public static HashMap<Integer, Integer> findFreq(int arr[], int freqArr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
