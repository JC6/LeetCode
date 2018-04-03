import re

INT_MAX = pow(2, 31) - 1
INT_MIN = pow(-2, 31)


class Solution:
    def myAtoi(self, str):
        try:
            s = re.findall('^[-]?[+]?[0-9]+', str.strip())
            if len(s) == 0:
                i = 0
            else:
                i = int(s[0])
            if i > INT_MAX:
                i = INT_MAX
            elif i < INT_MIN:
                i = INT_MIN
            return i
        except ValueError:
            return 0
