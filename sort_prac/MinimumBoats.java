package sort_prac;

import java.util.Arrays;

class MinimumBoats {
  public int numRescueBoats(int[] people, int limit) {
    // Sort the array in ascending order
    Arrays.sort(people);

    // Two-pointer approach
    int left = 0;
    int right = people.length - 1;
    int boats = 0;

    // Continue until all people are processed
    while (left <= right) {
      // If the lightest and heaviest can go together
      if (people[left] + people[right] <= limit) {
        // Move both pointers
        left++;
        right--;
      } else {
        // If they can't go together, send the heaviest alone
        right--;
      }
      // Count a boat for each iteration
      boats++;
    }

    return boats;
  }
}