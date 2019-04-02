import java.util.*;

public class AqyAirTravel {
    //TODO 需要注释
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0,count = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
            count++;
            if(sum > s){
                sum -= arr[i];
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}


