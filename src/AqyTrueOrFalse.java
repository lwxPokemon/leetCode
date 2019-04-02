import java.util.Scanner;

public class AqyTrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int f = n-t;
        if(a >= t ) {
            int m = a-t;
            System.out.println(n-m);
        }
        else {
            int m = t-a;
            System.out.println(n-m);
        }
    }
}
