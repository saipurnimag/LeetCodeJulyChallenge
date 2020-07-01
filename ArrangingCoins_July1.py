class Solution:
    def arrangeCoins(self, n: int) -> int:
        if(n==0):
            return 0
        s = 0
        count = 0
        i = 1
        ans = 1
        lo = 1
        hi = n
        while(lo<=hi):
            m = (lo+hi)//2
            k = (m*(m+1))//2
            if(k<=n):
                ans = m
                lo = m+1
            else:
                hi = m-1
        return ans
                