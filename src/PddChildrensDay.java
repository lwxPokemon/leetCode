import java.util.*;

public class PddChildrensDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> listN = new ArrayList <>();
        for(int i = 0;i<n;i++){
            listN.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int[] M = new int[m];
        for(int j = 0;j<m;j++){
            M[j] = sc.nextInt();
        }


        int count = 0;
        Arrays.sort(M);
        Collections.sort(listN);

        for(int i = 0;i<m;i++){
            if(M[i]>=listN.get(0)){
                count++;
                listN.remove(0);
            }
            if(listN.size()==0){
                break;
            }
        }

        System.out.println(count);
    }
}
