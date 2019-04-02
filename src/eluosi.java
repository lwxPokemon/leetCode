import java.util.*;

public class eluosi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String[] str = ss.split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        String qq = sc.nextLine();
        String[] str2 = qq.split(" ");
        List<String> ls = Arrays.asList(str2);
        Map<String,Integer> reMap = new HashMap <>();
        for(int i = 0;i < m;i++){
            if(reMap.containsKey(ls.get(i))){
                reMap.put(ls.get(i),Integer.valueOf(reMap.get(ls.get(i)))+1);
            }
            else
            {
                reMap.put(ls.get(i),1);
            }
        }
        if(reMap.size()<n){
            System.out.println(0);
        }
        else{
            int min = reMap.get("1");
            for(int i = 2;i <= n;i++){
                if(reMap.get(String.valueOf(i))<min){
                    min = reMap.get(String.valueOf(i));
                }
            }
            System.out.println(min);
        }
    }
}
