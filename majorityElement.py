class Solution:
    def majorityElement(nums):
        ans = None
        count = 0
        for i in nums:
            if count == 0:
                ans = i
            count += (1 if i == ans else -1)
        return ans


    result = majorityElement([3,2,3])
    print(result)