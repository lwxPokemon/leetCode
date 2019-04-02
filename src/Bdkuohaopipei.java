import java.util.Scanner;

public class Bdkuohaopipei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='['){
                left++;
            }
            if(str.charAt(i)==']' && left>0){
                left--;
            }
        }

        for(int j = str.length()-1;j>=0;j--){
            if(str.charAt(j)==']'){
                right++;
            }
            if(str.charAt(j)=='[' && right>0){
                right--;
            }
        }

        for(int i = 0;i<left;i++){
            str += "]";
        }
        for(int i = 0;i<right;i++){
            str = "["+str;
        }

        System.out.println(str);
    }
}
