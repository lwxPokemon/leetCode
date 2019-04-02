import java.util.Scanner;

public class AqyCycleNumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        String s1 = strArr[0],s2 = strArr[2];

        for(int i = 1;i < Long.valueOf(strArr[1]);i++){
            s1 += strArr[0];
        }
        for(int i = 1;i < Long.valueOf(strArr[3]);i++){
            s2 += strArr[2];
        }
        int n = s1.length();
        int m = s2.length();
        if(n<m){
            System.out.println("Less");
            return;
        }
        if(n>m){
            System.out.println("Greater");
            return;
        }
        for(int i =0;i<n;i++){
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println("Less");
                return;
            }
            if(s1.charAt(i)>s2.charAt(i)){
                System.out.println("Greater");
                return;
            }
        }
        System.out.println("Equal");
    }
}
