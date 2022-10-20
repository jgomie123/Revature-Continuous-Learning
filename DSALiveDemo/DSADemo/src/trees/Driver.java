package trees;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree1 = new BinaryTree(100);
		
		BinaryTree.insert(tree1, 50);
		BinaryTree.insert(tree1, 200);
		BinaryTree.insert(tree1, 150);
		BinaryTree.insert(tree1, 300);
		BinaryTree.insert(tree1, 34);
		BinaryTree.insert(tree1, 15);
		BinaryTree.insert(tree1, 63);
		
		System.out.println(BinaryTree.find(tree1, 31));
		BinaryTree.inOrderTraversal(tree1); //left, then the root, then the right
		System.out.println();
		BinaryTree.preOrderTraversal(tree1); //root, then the left, then the right
		System.out.println();
		BinaryTree.levelOrderTraversal(tree1); //looks for same-level children first
		
	}

}
