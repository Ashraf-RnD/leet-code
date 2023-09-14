package ashraf.rnd.leetcode.binarytree;

public class BinaryTreeSymmetric {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);



        var symmetric =  checkTreeSymmetric(root);
        System.out.println("symmetric = " + symmetric);

    }

    private static boolean checkTreeSymmetric(TreeNode root) {
        if(root ==null){
            return true;
        } else{
            return isSymmetric(root.left, root.right);
        }
    }

    public static boolean isSymmetric(TreeNode leftNode, TreeNode rightNode){
        if (leftNode == null && rightNode == null) {
            return true;
        }else if (leftNode == null || rightNode == null) {
            return false;
        }else {
            return (leftNode.val == rightNode.val) &&
                    isSymmetric(leftNode.left,rightNode.right) && isSymmetric(leftNode.right,rightNode.left);
        }
    }
}
