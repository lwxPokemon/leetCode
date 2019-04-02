import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AqyDNASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        Set<String> set = new HashSet <>();
        if(length==1){
            System.out.println(1);
        }
        for(int i = 1;i<length;i++){
            for(int j = 0;j<length-i;j++){
                set.add(str.substring(j,j+i));
            }
            if(set.size()<Math.pow(4,i)){
                System.out.println(i);
                return;
            }
            else{
                set.clear();
            }
        }
    }
}
