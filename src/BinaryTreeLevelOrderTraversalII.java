import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        levelOrderBottom(t);
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resList = new ArrayList <>();
        Queue<TreeNode> queue = new LinkedList <>();
        if(root == null){
            return resList;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            while(size>0){
                TreeNode t = queue.poll();
                size--;
                tmp.add(t.val);
                if(t.left!=null) queue.offer(t.left);
                if(t.right!=null) queue.offer(t.right);
            }
            resList.add(0,tmp);
        }
        return resList;
    }
}
