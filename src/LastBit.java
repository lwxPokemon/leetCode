import java.util.Scanner;

public class LastBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        long res = 0;
        long len = String.valueOf(sum).length();
        long left = 0,mid = 0,right = sum;

        while(left+1 < right){
            mid = (left+right)/2;
            res = 0;
            for(int j = 0;j < String.valueOf(mid).length();j++){
                res += (mid/(Math.pow(10,j)));
            }
            if(res == sum){
                System.out.println(mid);
                return;
            }
            else if(res > sum){
                right = mid;
            }
            else if(res < sum){
                left = mid;
            }
        }
        System.out.println(-1);
    }
}

