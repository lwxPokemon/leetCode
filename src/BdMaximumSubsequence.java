import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lwx
 */

public class BdMaximumSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        br.close();

        StringBuilder sb = new StringBuilder();
        char ch = s[s.length - 1];
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] >= ch) {
                sb.append(s[i]);
                ch = s[i];
            }
        }
        System.out.println(sb.reverse());
    }
}