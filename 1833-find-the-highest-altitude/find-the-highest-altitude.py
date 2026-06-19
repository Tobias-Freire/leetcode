class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        highestAltitude = 0
        currentAltitude = 0

        for _, v in enumerate(gain):
            currentAltitude += v
            if currentAltitude > highestAltitude:
                highestAltitude = currentAltitude

        return highestAltitude
        