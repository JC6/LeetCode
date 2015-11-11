var twoSum = function (nums, target) {
    var result = [];
    var map = {};
    for (var i = 0; i < nums.length; i++) {
        if (target - nums[i] in map) {
            result.push(map[target - nums[i]] + 1);
            result.push(i + 1);
            break;
        }
        map[nums[i]] = i;
    }
    return result;
};
