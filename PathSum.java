 public class PathSum {
        public int hasPath(int target, TreeNode tree){
            if (tree == null){
                return 0;
            }
            target = target - tree.info;
            if (target ==0 && tree.right ==null && tree.left == null){
                return 1;
            }
            if (hasPath(target, tree.left) == 1 || hasPath(target, tree.right) == 1) {
                return 1; 
            }
               
            return 0;

    }
}