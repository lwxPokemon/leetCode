import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hw1601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            Queue<Integer> queue = new LinkedList <>();

            if(n==1){
                System.out.println(0);
                return;
            }
            if(n==2){
                System.out.println(1);
                return;
            }

            for(int i = 0;i<n;i++){
                queue.add(i);
            }

            while(queue.size()>1){
                queue.add(queue.poll());
                queue.add(queue.poll());
                queue.poll();
            }
            System.out.println(queue.poll());
        }
    }
}
