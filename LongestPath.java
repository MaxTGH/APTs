import java.util.*;
public class LongestPath {
    public int[] longest(TreeNode t) {

        if (t == null){
            return new int[0];
        }
        int[] leftTree = longest(t.left);
        int[] rightTree = longest(t.right);
        int[] current;
        int length = 0;
        if (leftTree.length > rightTree.length){
            length = leftTree.length;
            current = new int[length+1];
            current[0] = t.info;
            System.arraycopy(leftTree, 0, current, 1, leftTree.length);
            return current;
        }
        else{
            if (rightTree.length == leftTree.length && sum(leftTree) > sum(rightTree)){
                            length = leftTree.length;
                            current = new int[length+1];
                
                            current[0] = t.info;
                            System.arraycopy(leftTree, 0, current, 1, rightTree.length);
                            return current;
                        }
                        else{
                            length = rightTree.length;
                            current = new int[length+1];
                
                            current[0] = t.info;
                            System.arraycopy(rightTree, 0, current, 1, rightTree.length);
                            return current;
                        }
            
                        
                    }
                    
            
                    
               
                }
            
        private int sum(int[] leftTree) {
            int ret = 0;
            for (int i: leftTree){
                ret += i;
            }
            return ret;
        }

}