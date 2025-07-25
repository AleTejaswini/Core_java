package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int K = 4;

        for (int i = 0; i <= arr.length - K; i++) {
            Set<Integer> distinct = new HashSet<>();

      
            for (int j = i; j < i + K; j++) {
                distinct.add(arr[j]);
            }

            System.out.println("window" + Arrays.toString(Arrays.copyOfRange(arr, i, i + K)) +
                    "→distinct count: " + distinct.size());
        }
    }
}