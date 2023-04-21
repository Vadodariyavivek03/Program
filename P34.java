import java.util.*;

public class P34
{
  public static void main(String[] args) 
  {
    TreeNode d = new TreeNode("d");
    TreeNode e = new TreeNode("e");
    TreeNode f = new TreeNode("f");
    
    TreeNode b = newTreeNode("b", d, null);
    TreeNode c = newTreeNode("c", e, f);

    TreeNode root = new TreeNode("a", b, c);

     System.out.println("Print BST all Leafs : ");

    printLeafs(root);
  }

  private static class TreeNode
  {
     String value;
     TreeNode left;
     TreeNode right;

     TreeNode(String value)
     {
        this.value = value;
     }

     TreeNode(String data, TreeNode left, TreeNode right)
     {
        this.value = data;
        this.left = left;
        this.right = right;
     }

     boolean isLeaf()
     {
       return left == null ? right == null : false;
     }
  }

    static void printLeafs(TreeNode node)
    {

      if (node == null) 
      {
         return;	
      }

      if (node.isLeaf()) 
      {
        System.out.printf("%s ", node.value);	
      }

      printLeafs(node.left);
      printLeafs(node.right);

    }

}