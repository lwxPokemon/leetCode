import java.util.Scanner;

public class Aqyhuiwensusu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int count = 0;
        for (int i = left; i <= right ; i++) {
            if(Ishuiwensusu(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean Ishuiwensusu(int num){
        if(num == 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                return false;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        String str = sb.reverse().toString();
        if(!String.valueOf(num).equals(str)){
            return false;
        }
        return true;
    }
}















