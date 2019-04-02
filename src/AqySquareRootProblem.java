import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AqySquareRootProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        double dou = 0;
        DecimalFormat  df = new DecimalFormat("######0.00000");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++) {
                dou = (Math.sqrt(i)+Math.sqrt(j))*(Math.sqrt(i)+Math.sqrt(j));
                dou = Double.valueOf(df.format(dou));
                if((int)dou == dou ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
