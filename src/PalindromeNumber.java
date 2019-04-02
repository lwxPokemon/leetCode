public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString();
        return reverseNumber.equals(String.valueOf(x));

       /* if(x < 0 || (x%10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;*/
    }
}
