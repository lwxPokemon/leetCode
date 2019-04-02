import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List <List <Integer>> resList = new ArrayList <>();
        Queue <Node> queue = new LinkedList <>();
        if (root == null) {
            return resList;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List <Integer> temp = new ArrayList <>();
            while (size > 0) {
                size--;
                Node node = queue.poll();
                temp.add(node.val);
                for (Node n : node.children) {
                    if (n != null)
                        queue.add(n);
                }
            }
            resList.add(temp);
        }
        return resList;

    }
}
