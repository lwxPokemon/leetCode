import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WyArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Comparator cmp = new MyComparator();
        Arrays.sort(arr,cmp);
        int d = arr[1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (i < n - 1 && (arr[i + 1] - arr[i]) != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
    //实现Comparator接口
    class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
    		        /*如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
    		         这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了*/
            return o2 - o1;
        }
    }

