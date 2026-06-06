class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = []
        currentLeftSum = 0
        currentRightSum = 0

        for i in range(n):
            # Left sum
            isValidIdx = (i-1) >= 0
            currentLeftSum += nums[i-1] if isValidIdx else 0

            # Right sum
            for j in range(n-1, i, -1):
                isValidIdx = j > i
                currentRightSum += nums[j] if isValidIdx else 0

            # Absolute difference for current index
            currentDiff = abs(currentLeftSum - currentRightSum)
            result.append(currentDiff)

            currentRightSum = 0

        return result