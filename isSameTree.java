class Solution {
    public static boolean preorder(TreeNode root1, TreeNode root2, boolean isTrue) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val == root2.val) {
            isTrue = true;
        } else {
            return false;
        }

        isTrue = preorder(root1.left, root2.left, isTrue);

        if (!isTrue) {
            return false;
        }

        isTrue = preorder(root1.right, root2.right, isTrue);

        if (!isTrue) {
            return false;
        }

        return isTrue;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p, q, false);
    }
}
