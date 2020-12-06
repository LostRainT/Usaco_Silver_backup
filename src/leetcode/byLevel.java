//import javax.swing.tree.TreeNode;
//import java.util.*;
//import java.util.function.BinaryOperator;
//
//public class byLevel {
//    List<List<Integer>> levels = new ArrayList<List<Integer>>();
//    public static void main(String[] args) {
//
//    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        help(root,0);
//        return levels;
//    }
//    public static int help(TreeNode root, int level) {
//        if (levels.size() == level) {
//            levels.add(new ArrayList<Integer>());
//        }
//
//        levels.get(level).add(node.val);
//        if(node.left != null){
//            help(root.left,level+1);
//        }
//        if(node.right != null){
//            help(root.right,level+1);
//        }
//    }
//
//}
