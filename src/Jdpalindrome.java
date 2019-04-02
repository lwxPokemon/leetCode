import java.util.*;
public class Jdpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLen = str.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        sb.append(str);
        if(sb.reverse().toString().equals(str)){
            System.out.println(strLen);
            return;
        }
        sb.reverse();
        if(strLen==1){
            System.out.println(1);
            return;
        }
        if(strLen==2){
            if(str.charAt(0)==str.charAt(1)){
                System.out.println(2);
                return;
            }
            else{
                System.out.println(3);
                return;
            }
        }

        int count = 0;
        if(strLen>=3){
            for(int i = 1;i<strLen;i++){
                sbb.append(str.substring(0,i));
                String ss = sbb.reverse().toString();
                sb.append(ss);
                String strTemp = sb.toString();
                if(strTemp.equals(sb.reverse().toString())){
                    System.out.println(strLen+i);
                    return;
                }
                sbb.delete(0,sbb.length());
                sb.delete(0,sb.length());
                sb.append(str);
            }
            System.out.println(2*strLen-1);
        }
    }
}