class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        res = 0
        for i, char in enumerate(columnTitle):
            res += (ord(char)-64) * (26 ** (len(columnTitle) - i -1))
        return res