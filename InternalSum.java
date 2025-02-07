public class InternalSum {
    public int sum(TreeNode t) {
        if (t == null){
            return 0;
        }
        if (t.right ==null && t.left == null){ //leaf
            return 0;
        }
        return t.info + sum(t.left) + sum(t.right);
    }
}