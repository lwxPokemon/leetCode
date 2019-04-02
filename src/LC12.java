import java.util.Scanner;

public class LC12 {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] dp = new int[N + 1];
        dp[0] = 0;
        if(N>0){
            dp[1] = 1;
        }
        if(N>1){
            dp[2] = 2;
        }
        if(N>2){
            for(int i = 3;i < dp.length;i++){
                if(i < 5){
                    dp[i] = dp[i-1] + dp[i -2];
                }
                if(i >= 5){
                    dp[i] = dp[i-1] + dp[i -2] +dp[i -5];
                }
            }
            System.out.println(dp[N]);
        }
        /*if (N == 1){
            System.out.println(1);
            return;
        }
        if (N == 2){
            System.out.println(3);
            return;
        }
        // init
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3;i <= N;i++){
            if (i >= 5){
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 5];
            }
            if (i < 5 ){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        System.out.println(dp[N]);*/
    }
}
