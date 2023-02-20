import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class PreOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        tree(root, result);
        return (result);
    }

    public void tree(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        tree(root.left, result);        
        tree(root.right, result);
    }
}