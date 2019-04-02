import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KthSmallestElementInASortedMatrix {
    /**
     * 有序矩阵中第K小的元素
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);


        /**
         * 优先级队列
         */
       /* PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
            if(o1 - o2 > 0){
                return -1;
            }else if(o1 - o2 < 0){
                return 1;
            }
            return 0;
        }));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(pq.size() < k){
                    pq.add(matrix[i][j]);
                }else if(matrix[i][j] < pq.peek()){
                    pq.remove();
                    pq.add(matrix[i][j]);
                }
            }
        }
        return pq.remove();*/
    }
}
