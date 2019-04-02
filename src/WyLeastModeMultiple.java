import java.util.*;

public class WyLeastModeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int max = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList <>();
        for(int i = 0;i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }

        for(int i = 1;i<max;i++){
            int count = 0;
            for(int j = 0;j<5;j++){
                if(i%list.get(j)==0){
                    count++;
                }
            }
            if(count>=3){
                System.out.println(i);
                break;
            }
        }
    }
}
