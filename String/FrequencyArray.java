gfdhgdimport java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 1, 2, 4, 5, 1, 3, 2, 4, 1, 5 };
    }

    static Map<Integer, Integer> create(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
