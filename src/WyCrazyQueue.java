import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WyCrazyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList <>();
        list.add(arr[n-1]);

        List<Integer> temp = new ArrayList <>();
        for(int i = 0;i<n-1;i++){
            temp.add(arr[i]);
        }

        int len = temp.size();
        for(int i = 0;i<len/2;i++){
            if(i%2==0){
                list.add(0,temp.get(0));
                list.add(temp.get(1));
                temp.remove(0);
                temp.remove(0);
            }
            else if(i%2==1){
                list.add(0,temp.get(temp.size()-1));
                list.add(temp.get(temp.size()-2));
                temp.remove(temp.size()-1);
                temp.remove(temp.size()-1);
            }
        }

        if(temp.size()==1){
            if(Math.abs(temp.get(0)-list.get(0))>Math.abs(temp.get(0)-list.get(list.size()-1))){
                list.add(0,temp.get(0));
            }
            else{
                list.add(temp.get(0));
            }
        }
        else{
            int last = list.get(n-1);
            if(Math.abs(last-list.get(n-2))<Math.abs(last-list.get(0))){
                list.remove(n-1);
                list.add(0,last);
            }
        }

        int sum = 0;
        for(int i = 0;i<n;i++){
            if(i<n-1){
                sum += Math.abs(list.get(i+1)-list.get(i));
            }
        }
        System.out.println(sum);
    }
}
