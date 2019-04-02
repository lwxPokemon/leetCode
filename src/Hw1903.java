import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw1903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            List<String> list = new ArrayList <>();
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)!='|' && str.charAt(i)!=' '){
                    sb.append(str.charAt(i));
                    continue;
                }
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }

            list.remove("RmApp");


        }
    }
}
