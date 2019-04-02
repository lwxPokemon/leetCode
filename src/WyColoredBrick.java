import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WyColoredBrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap <>();
        for(int i = 0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }
            else{
                map.put(ch[i],map.get(ch[i]+1));
            }
        }
        if(map.size()==1){
            System.out.println(1);
        }
        else if(map.size()>=3){
            System.out.println(0);
        }
        else{
            System.out.println(2);
        }
    }
}
