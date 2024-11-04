package hashmapprac;

import java.util.HashMap;

public class BasicMethods {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(10, 70);
    map.put(20, 80);
    map.put(30, 90);
    map.put(40, 100);
    System.out.println(map.get(20));
    System.out.println(map.containsKey(30));
    System.out.println(map.remove(30));
    System.out.println(map.containsKey(30));
  }
}