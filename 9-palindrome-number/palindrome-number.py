class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num = str(x)
        for i in range(0, len(num)//2):
            if num[i] != num[-i-1]:
                return False
        return True
        