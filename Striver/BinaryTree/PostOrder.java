import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class PostOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        tree(root, result);
        return (result);
    }

    public void tree(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }       
        tree(root.left, result);        
        tree(root.right, result);
        result.add(root.val);
    }
}