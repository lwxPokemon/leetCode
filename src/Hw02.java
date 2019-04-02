import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hw02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
////
////        }
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet <>();
        for(int i = 0;i<n;i++){
            set.add(sc.nextInt());
        }

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(String.valueOf(it.next()));
        }
    }
}
