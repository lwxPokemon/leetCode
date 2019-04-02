import java.util.Scanner;

public class WyStaggered01Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        int sum = 1;
        if(str.length()==0){
            System.out.println(0);
        }
        if(str.length()==1){
            System.out.println(1);
        }
        for(int i = 0;i<str.length();i++){
            if((i<str.length()-1)&&str.charAt(i)!=str.charAt(i+1)){
                sum++;
            }
            if((i<str.length()-1)&&str.charAt(i)==str.charAt(i+1)){
                sum = 1;
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
