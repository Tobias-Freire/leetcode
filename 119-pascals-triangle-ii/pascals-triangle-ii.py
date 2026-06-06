class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if (rowIndex == 0):
            return [1]

        upperList = self.getRow(rowIndex-1)
        result = [0]*(rowIndex+1)
        for i, _ in enumerate(result):
            leftUpper = upperList[i-1] if (i-1 >= 0) else 0
            rightUpper = upperList[i] if (i < len(upperList)) else 0
            result[i] = leftUpper + rightUpper
        
        return result