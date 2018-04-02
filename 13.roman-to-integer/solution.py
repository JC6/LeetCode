class Solution:
    def romanToInt(self, s):
        roman = 0
        s = s[::-1]
        last_number = 0
        di = {'M': 1000,
              'D': 500,
              'C': 100,
              'L': 50,
              'X': 10,
              'V': 5,
              'I': 1}
        for i in s:
            if di.get(i) < last_number:
                roman -= di.get(i)
            else:
                roman += di.get(i)
            last_number = di.get(i)
        return roman
