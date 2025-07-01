class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1;
        int b = 2;
        int nways = 1;
        for (int i = 3; i <= n; i++) {
            nways = a + b;
            a = b;
            b = nways;
        } 

        return nways;
    }
}