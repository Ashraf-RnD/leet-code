package ashraf.rnd.leetcode.binarytree;

import java.util.*;

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

        var invertedTree = invertTree(tree);
        System.out.println("invertedTree = " + preorderTraversal(invertedTree, new ArrayList<>()));

        var pathList = binaryTreePaths(tree);
        System.out.println("pathList = " + pathList);

        Set<TreeNode> boundaryList = doBoundaryTraverse(tree);
        new ArrayList<>(boundaryList).forEach(node -> System.out.println("Boundary = " + node.val));

    }

    private static Set<TreeNode> doBoundaryTraverse(TreeNode tree) {
        var leftBoundary = getLeftBoundaryNodeList(tree, new LinkedList<>());
        Set<TreeNode> boundaryList = new LinkedHashSet<>(leftBoundary);//to maintain order LinkedHashSet

        var nodeList = getLeafNodeList(tree, new LinkedList<>());
        boundaryList.addAll(nodeList);

        var rightBoundary = getRightBoundaryNodeList(tree, new LinkedList<>());
        boundaryList.addAll(rightBoundary);
        return boundaryList;
    }

    public static List<TreeNode> getRightBoundaryNodeList(TreeNode root, List<TreeNode> nodeList){
        if (root==null){
            return nodeList;
        } else if (root.right == null) {
            nodeList.add(root);
            return nodeList;
        }else {
            nodeList.add(root);
            return getRightBoundaryNodeList(root.right,nodeList);
        }
    }
    public static List<TreeNode> getLeftBoundaryNodeList(TreeNode root, List<TreeNode> nodeList){
        if (root==null){
            return nodeList;
        } else if (root.left == null) {
            nodeList.add(root);
            return nodeList;
        }else {
            nodeList.add(root);
            return getLeftBoundaryNodeList(root.left,nodeList);
        }
    }

    public static List<TreeNode> getLeafNodeList(TreeNode root, List<TreeNode> nodeList){
        if (root==null){
            return nodeList;
        } else if (root.left==null && root.right==null) {
            nodeList.add(root);
        }else {
            getLeafNodeList(root.left,nodeList);
            getLeafNodeList(root.right,nodeList);
        }
        return nodeList;
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

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            var node = root.left;
            root.left = root.right;
            root.right = node;
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

    //merge binary trees

    public static TreeNode mergeTrees(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null) {
            return tree2;
        } else if (tree2 == null) {
            return tree1;
        } else {
            tree1.val += tree2.val;
            tree1.left=mergeTrees(tree1.left,tree2.left);
            tree1.right=mergeTrees(tree1.right,tree2.right);
            return tree1;
        }
    }

}
