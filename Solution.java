import java.util.Arrays;
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

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        nums1 = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums1, nums1.length - nums2.length, nums2.length);
        Arrays.sort(nums1);
        return nums1.length % 2 == 0
                ? (nums1[(nums1.length) / 2] + nums1[(nums1.length - 1) / 2]) / 2.0 : nums1[(nums1.length) / 2];
    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10
                    || result == Integer.MAX_VALUE / 10 && x % 10 > Integer.MAX_VALUE % 10
                    || result == Integer.MIN_VALUE / 10 && x % 10 > Integer.MAX_VALUE % 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    public int myAtoi(String str) {
        str = str.trim();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
                result = result.concat(Character.toString(str.charAt(0)));
                continue;
            }
            if (!Character.isDigit(str.charAt(i))) {
                break;
            }
            result = result.concat(Character.toString(str.charAt(i)));
        }
        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            if (result.length() > 1) {
                if (result.charAt(0) == '-') {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            return 0;
        }
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }
        for (int i = 2; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int addDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result > 9 ? addDigits(result) : result;
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
