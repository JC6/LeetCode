class Solution:
    def isPalindrome(self, x):
        x = str(x)
        return x == x[::-1]
