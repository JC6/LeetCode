class Solution:
    def reverse(self, x):
        if x is not 0:
            x = int(abs(x) / x) * int(str(abs(x))[::-1])
        if abs(x) > pow(2, 31) - 1:
            x = 0
        return x
