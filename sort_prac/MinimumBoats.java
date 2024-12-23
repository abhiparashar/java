package sort_prac;

class MinimumBoats {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                System.out.print(people[i] + people[j]);
                if (people[i] + people[j] <= limit) {
                    count += count;
                }
            }
        }
        return count;
    }
}