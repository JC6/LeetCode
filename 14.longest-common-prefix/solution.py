class Solution:
    def longestCommonPrefix(self, strs):
        if len(strs) == 0:
            return ""
        st = strs[0]
        for s in strs:
            sl = len(s)
            while sl > 0:
                if s[0:sl] == st[0:sl]:
                    st = s[0:sl]
                    break
                sl -= 1
            if sl == 0:
                return ""
        return st
