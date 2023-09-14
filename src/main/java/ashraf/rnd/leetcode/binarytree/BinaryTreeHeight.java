package ashraf.rnd.leetcode.binarytree;

public class BinaryTreeHeight {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(20);

        tree.left = new TreeNode(8);
        tree.right = new TreeNode(22);

        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(12);

        tree.right.right = new TreeNode(25);

        tree.left.right.left = new TreeNode(10);
        tree.left.right.right = new TreeNode(14);

        var height = getHeight(tree);
        System.out.println("height = " + height);


    }

    public static int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight,rightHeight)+1;
        }
    }

}
