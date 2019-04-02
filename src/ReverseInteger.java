public class ReverseInteger {
    public int reverse(int x) {
        String xStr = String.valueOf(x);
        String result = "";
        StringBuilder sb = new StringBuilder(xStr);
        result = sb.reverse() + result;
        if (String.valueOf(result.charAt(result.length()-1)).equals("-")){
            result = result.substring(0,result.length()-1);
            result = "-" + result;
        }
        Long resultLong = Long.valueOf(result);
        if (resultLong> 2147483647L || resultLong< -2147483648L) {
            return 0;
        }
        return Integer.valueOf(result) ;

        /*int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;*/
    }
}
