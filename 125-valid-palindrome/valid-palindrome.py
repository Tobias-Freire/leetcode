class Solution:
    def isPalindrome(self, s: str) -> bool:
        sanitizedStr = "".join(char for char in s if (char.isalnum() and char != " ")).lower()
        
        n = len(sanitizedStr)
        stringArray = list(sanitizedStr)

        l = 0
        r = n-1

        while(True):
            if l > r:
                break
            
            if stringArray[l] != stringArray[r]:
                return False
            
            l += 1
            r -= 1
        
        return True
        