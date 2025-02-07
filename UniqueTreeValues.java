import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        int[] leftTree = unique(root.left);
        int[] rightTree = unique(root.right);
        Set<Integer> set = new HashSet<>();
        set.add(root.info);
        for (int k: leftTree){
            set.add(k);
        }
        for (int k: rightTree){
            set.add(k);
        }
        int[] ret = new int[set.size()];
        int i = 0;
        for (int k: set){
            ret[i] = k;
            i++;
        }

        Arrays.sort(ret);
        return ret;
    }     

}