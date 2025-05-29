class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) { return x; }
        if (x == 2 || x == 3) { return 1; }

        int start = 2;
        int end = x;

        while (true) {
            long square = (long) start * start;
            long nextSquare = (long) (start + 1) * (start + 1);

            if (square <= x && nextSquare > x) {
                return start;
            }
            start++;
        }
    }
}