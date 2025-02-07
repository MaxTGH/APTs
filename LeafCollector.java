import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        List<String> rounds = new ArrayList<>();

        while (tree != null) {
            List<String> leaves = new ArrayList<>();
            tree = removeLeaves(tree, leaves); 
            rounds.add(leafString(leaves));
        }

        return rounds.toArray(new String[0]); 
    }

    private TreeNode removeLeaves(TreeNode tree, List<String> leaves) {
        if (tree == null) {
            return null; 
        }

        if (tree.left == null && tree.right == null) {
            leaves.add(tree.info + "");
            return null;
        }

        tree.left = removeLeaves(tree.left, leaves);
        tree.right = removeLeaves(tree.right, leaves);

        return tree; 
    }

    private String leafString(List<String> leaves) {
        return String.join(" ", leaves);
    }
}