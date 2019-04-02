import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw1901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList <>();
        while(sc.hasNext()){
             char[] ch = sc.nextLine().toCharArray();
             int len = ch.length;

             for(int i = 0;i<len;i++){
                 if(ch[i]=='+'){
                     list.add(sb.toString());
                     list.add("+");
                     sb.delete(0,sb.length());
                     continue;
                 }
                 if(ch[i]=='-'){
                     list.add(sb.toString());
                     list.add("-");
                     sb.delete(0,sb.length());
                     continue;
                 }

                 sb.append(String.valueOf(ch[i]));
             }

             list.add(sb.toString());

             int sum = Integer.valueOf(list.get(0));
             for(int i = 0;i<list.size();i++){
                 if(list.get(i).equals("+")){
                     sum += Integer.valueOf(list.get(i+1));
                 }
                 if(list.get(i).equals("-")){
                     sum -= Integer.valueOf(list.get(i+1));
                 }
             }

            System.out.println(sum);
        }
    }
}
