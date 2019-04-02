import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resList = new ArrayList <>();
        String path = "";
        findPath(root,resList,path);
        return resList;
    }

    public void findPath(TreeNode root,List<String> list,String path){
        if(root == null){
            return;
        }
        path += root.val + " " ;
        if(root.left == null && root.right == null){
            list.add(path.trim().replace(" ","->"));
        }
        if(root.left!=null){
            findPath(root.left,list,path);
        }
        if(root.right!=null){
            findPath(root.right,list,path);
        }
    }
}


