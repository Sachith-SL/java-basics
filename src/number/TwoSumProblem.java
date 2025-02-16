package number;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    //1. brute-force solution
    public static int[] example1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // 2. hash map solution
    public static int[] example2(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{i, numMap.get(complement)};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
