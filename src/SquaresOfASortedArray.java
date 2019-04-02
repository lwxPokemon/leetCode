import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        ArrayList<Integer> res = new ArrayList <>();
        for(int i = 0;i < A.length;i++){
            res.add(A[i]*A[i]);
        }
        int j = 0;
        for(int i : res){
            A[j] = i;
            j++;
        }
        Arrays.sort(A);
        return A;
    }
}
