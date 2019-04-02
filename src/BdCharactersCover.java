import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author lwx
 */
public class BdCharactersCover {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] temp = br.readLine().toCharArray();

       Arrays.sort(temp);

        List<Character> list = new ArrayList <>();
        for(Character c:temp){
            list.add(c);
        }
        Collections.reverse(list);
        for(int i = 0;i<str.length;i++){
            if(list.size()>0&&str[i]<list.get(0)){
                str[i] = list.get(0);
                list.remove(0);
            }
        }

        System.out.println(new String(str));
    }
}