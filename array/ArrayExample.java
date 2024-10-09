public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + 10;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}