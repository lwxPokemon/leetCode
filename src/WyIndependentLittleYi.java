import java.util.Scanner;

public class WyIndependentLittleYi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        if(x*f == d){
            System.out.println(f);
        }
        else if(x*f > d){
            for(int i = 0;i<f;i++){
                if(x*i>d){
                    System.out.println(i-1);
                    return;
                }
            }
        }
        else {
            int res = (d-(x*f))/(x+p)+f;
            System.out.println(res);
        }
    }
}
