class Solution {
    public int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            if (i == 0 && digits[i] == 9) {
                newDigits[i+1] = 0; 
                newDigits[i] = 1;
                return newDigits;
            }

            if (digits[i] < 9) {
                digits[i] += carry;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            } 

            newDigits[i+1] = digits[i];
        }
        return digits;
    }
}