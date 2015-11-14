import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]) + 1;
                result[1] = i + 1;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum > 9 ? addDigits(sum) : sum;
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
