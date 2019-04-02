import java.util.*;

public class AqyRedAndGreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<ch.length;i++){

            int count = 0;

            for(int j = 0;j<i;j++){
                if(ch[j]=='G'){
                    count++;
                }
            }

            for(int k = i;k<ch.length;k++){
                if(ch[k]=='R'){
                    count++;
                }
            }

            min = Math.min(min,count);
        }

        System.out.println(min);

        Map<String,String> re = new HashMap <>();

    }
}
