using System.Collections.Generic;

public class Solution {

    public int[] TwoSum(int[] nums, int target) {
        int[] result = new int[2];
        var map = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) {
            if (map.ContainsKey(target - nums[i])) {
                result[0] = map[target - nums[i]] + 1;
                result[1] = i + 1;
                break;
            }
            if (!map.ContainsKey(nums[i])) {
                map.Add(nums[i], i);
            }
        }
        return result;
    }
}
