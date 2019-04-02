import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class AqyStringValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        Map<Character,Integer> resMap = new HashMap <>();
        for(int i = 0;i<str.length();i++){
            if(resMap.containsKey(str.charAt(i))){
                resMap.put(str.charAt(i),resMap.get(str.charAt(i))+1);
            }
            else{
                resMap.put(str.charAt(i),1);
            }
        }
        List<Integer> list = new ArrayList <>();
        Iterator itMap = resMap.entrySet().iterator();
        while(itMap.hasNext()){
            Map.Entry entry = (Map.Entry)itMap.next();
            list.add((int)(entry.getValue()));
        }
        Collections.sort(list);
        int len = list.size();
        for(int i = 0;i < len;i++){
            if((list.get(len-i-1)-k)>=0){
                int temp = list.get(len-i-1);
                list.remove(len-i-1);
                list.add(temp-k);
                break;
            }
            else{
                k = k-list.get(len-i-1);
                list.remove(len-i-1);
            }
        }

        int res = 0;
        for(int i = 0;i<list.size();i++){
            res += list.get(i)*list.get(i);
        }
        System.out.println(res);
    }
}
