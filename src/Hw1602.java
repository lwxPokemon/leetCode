import java.util.*;

public class Hw1602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            Set<Character> set = new LinkedHashSet <>();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<ch.length;i++){
                if(set.add(ch[i])){
                    sb.append(ch[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}


//dBowNgxyPZXZXlBTMKFskExQEK