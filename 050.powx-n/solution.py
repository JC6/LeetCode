class Solution:
    def myPow(self, x, n):
        if n == 1:
            return x
        if n == 0:
            return 1
        if n == -1:
            return 1 / x
        return self.myPow(x * x, n // 2) * self.myPow(x, n % 2)
