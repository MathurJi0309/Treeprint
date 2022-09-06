package DataStructure;

public class Tree {
	public static void Treeprint(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null) {
			System.out.print("L" + root.left.data  +",");
		}
		if(root.right!=null) {
			System.out.print("R" + root.right.data );
		}
		System.out.println();
		 Treeprint(root.left);
		 Treeprint(root.right);
	}
	public static void main(String []args) {
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
		root.left=rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeright =new BinaryTreeNode<Integer>(5);
		root.left.left=twoleft;
		root.right.right=threeright;
		 Treeprint(root);
	}
}
