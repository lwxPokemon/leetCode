import java.sql.SQLSyntaxErrorException;
import java.text.DecimalFormat;
import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N根绳子
        int M = sc.nextInt(); // 最后剪掉出来的绳子
        double[] count = new double[N];

        double sum = 0;

        // 每根绳子的长度
        for (int i = 0;i < N;i++){
            count[i] = sc.nextInt();
            sum +=count[i];
        }

        if (sum < M){
            System.out.println(0);
            return;
        }
        else{
            DecimalFormat df = new DecimalFormat("#.00");

            double bound = 1,ubound = 1000000;
            double count1 = 0;
            while (bound < ubound){
                double mid = (ubound + bound)/2 + 1;
                count1 = 0;
                for (int i = 0;i < N;i++){
                    count1 = count1 + count[i] / mid;
                }

                if (count1 < M){
                    ubound = mid - 1;
                }else{
                    bound = mid;
                }
            }

            System.out.println(bound);
        }

    }
}

