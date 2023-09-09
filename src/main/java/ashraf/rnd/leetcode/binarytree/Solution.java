package ashraf.rnd.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        var inorderList = inorderTraversal(tree, new ArrayList<>());
        System.out.println("inorderList = " + inorderList);

        var preorderList = preorderTraversal(tree, new ArrayList<>());
        System.out.println("preorderList = " + preorderList);

        var postorderList = postorderTraversal(tree, new ArrayList<>());
        System.out.println("postorderList = " + postorderList);

        var pathList = binaryTreePaths(tree);
        System.out.println("pathList = " + pathList);

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> lis = new ArrayList<>();
        dfs(root, lis, "");
//        for(int i = 0; i < lis.size(); i++)
//            lis.set(i, lis.get(i).substring(2));
        return lis;
    }
    public static void dfs(TreeNode node, List<String> lis, String s){
        if(node == null) return;
        if(node.left == null && node.right == null)
            lis.add(s + "->" + node.val);
        s += "->" + node.val;
        dfs(node.left, lis, s);
        dfs(node.right, lis, s);

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            var node = root.left;
            root.left=root.right;
            root.right=node;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static List<Integer> inorderTraversal(TreeNode root, List<Integer> numberList) {

        if (root != null) {
            inorderTraversal(root.left, numberList);
            numberList.add(root.val);
            inorderTraversal(root.right, numberList);
        }
        return numberList;

    }

    public static List<Integer> preorderTraversal(TreeNode root, List<Integer> numberList) {
        if (root != null) {
            numberList.add(root.val);
            preorderTraversal(root.left, numberList);
            preorderTraversal(root.right, numberList);
        }
        return numberList;
    }

    public static List<Integer> postorderTraversal(TreeNode root, List<Integer> numberList) {
        if (root != null) {
            postorderTraversal(root.left, numberList);
            postorderTraversal(root.right, numberList);
            numberList.add(root.val);
        }
        return numberList;
    }

}
