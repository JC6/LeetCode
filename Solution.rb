def two_sum (nums, target)
  map = {}
  nums.each_with_index { |v, i| map[target - v] ? (return [map[target - v] + 1, i + 1]) : (map[v] = i) }
end
