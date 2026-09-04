/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public static class Info{
        int dia;
        int ht;
 public Info(int dia,int ht){
    this.dia=dia;
    this.ht=ht;
 }
    }


       
       public static Info diameter(TreeNode root){

          if(root==null){
            return new Info(0,0);
          }

          Info leftInfo = diameter(root.left);
          Info rightInfo = diameter(root.right);
          int dia = Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
          int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

          return new Info(dia,ht);
       }
    public int diameterOfBinaryTree(TreeNode root) {

          if (root == null) {
            return 0;
        }
        Info data = diameter(root);
        
        return data.dia-1;
    }
}
