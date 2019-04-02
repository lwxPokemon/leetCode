public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum -= root.val;
        if(sum == 0 && root.left == null && root.right == null){
            return true;
        }

        boolean b1 = hasPathSum(root.left,sum);
        boolean b2 = hasPathSum(root.right,sum);

        return (b1||b2);
    }
}
