public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if (Math.abs(getHeight(root.right) - getHeight(root.left)) > 1) return false;
        if(isBalanced(root.right)){
            return isBalanced(root.left);
        }
        return false;
    }

    //求树节点最大深度
    public static int getHeight(TreeNode t){
        if(null == t) return 0;
        int left = getHeight(t.left);
        int right = getHeight(t.right);

        return Math.max(left,right)+1;
    }
}
