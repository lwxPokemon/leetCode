import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList <>();
            while(true&&sc.hasNext()){
                int num = sc.nextInt();
                if(num==0){
                    break;
                }
                list.add(num);
            }

            int n = list.size();
            for(int i = 0;i<n;i++){
                System.out.println(list.get(i)/2);
            }
    }
}
