import java.util.*;

public class AqyDeleteDuplicateCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> set = new LinkedHashSet <>();
        for(int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while(it.hasNext()){
            sb.append(it.next());
        }
        System.out.println(sb.toString());
    }
}
