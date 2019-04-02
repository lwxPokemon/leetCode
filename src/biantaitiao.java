import java.util.Scanner;

public class biantaitiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n > 0){
            dp[1] = 1;
        }
        if(n > 1){
            dp[2] = 2;
        }
        if(n >2){
            for(int i = 3;i < dp.length;i++){
                dp[i] = 2*dp[i-1];
            }
        }
        System.out.println(dp[n]);
    }

}
