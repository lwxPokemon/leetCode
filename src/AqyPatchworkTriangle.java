import java.util.Arrays;
import java.util.Scanner;
public class AqyPatchworkTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

         int[] intArr = {a,b,c};
        Arrays.sort(intArr);

        int sum = intArr[0]+intArr[1];
        while(sum<=intArr[2]){
            c = sum -1;
        }
        System.out.println(a+b+c);
    }
}
