public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null){
            return null;
        }
        t.left = tighten(t.left);
        t.right = tighten(t.right);

        if (t.right == null && !(t.left ==null)){
            return t.left;
            

        }
        
        if (!(t.right == null) && (t.left ==null)){
            return t.right;
        }

        
        return t; 
        
        
    }
}