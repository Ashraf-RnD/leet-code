package ashraf.rnd.leetcode.binarytree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinaryTreePathTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
//
//        var pathList = binaryTreePaths(root);
//        System.out.println("pathList = " + pathList);

        Set<Integer> sumSet = new HashSet<>();
        pathTraverse(root, 0, 22, sumSet);
        System.out.println("flag = " + sumSet.contains(22));

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<>();
        dfs(root, pathList, "");
        pathList.replaceAll(s -> s.substring(2));
        return pathList;
    }

    public static void dfs(TreeNode node, List<String> pathList, String path) {
        if (node == null) return;
        if (node.left == null && node.right == null)
            pathList.add(path + "->" + node.val);
        path += "->" + node.val;
        dfs(node.left, pathList, path);
        dfs(node.right, pathList, path);
    }

    public static void pathTraverse(TreeNode root, int pathSum, int targetSum, Set<Integer> sumSet) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            sumSet.add(pathSum + root.val);
        }
        if (sumSet.contains(targetSum)){
            return;
        }
        pathSum += root.val;
        pathTraverse(root.left, pathSum, targetSum,sumSet);
        pathTraverse(root.right, pathSum, targetSum,sumSet);

    }
}
