import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZsLookingForAvalidString {
    static List<String> list = new ArrayList <>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = n, right = n;
        helper(left, right, new StringBuilder());
        StringBuilder res = new StringBuilder();
        for(String s: list) {
            res.append(s).append(',');
        }
        res.deleteCharAt(res.length()-1);
        System.out.println(res.toString());
    }
    public static void helper(int left, int right, StringBuilder sb) {
        if (right < left) return;
        if (left == 0 && right == 0) list.add(sb.toString());
        if (left > 0) {
            helper(left - 1, right, sb.append('('));
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right > 0) {
            helper(left, right - 1, sb.append(')'));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

