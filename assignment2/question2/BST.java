package com.samir.assignment2.question2;

	class Node {
		int data;
		Node left, right;
		Node (int data){
			this.data =data;
			left = right = null;
		}
	}
	class BST{
		Node node;
		Node prev = null;
		Node newhead = null;
		void BST(Node root) {
			if (root== null)
				return;
			BST(root.left);
			Node rightNode = root.right;
			Node leftNode = root.left;
			if (newhead == null) {
				newhead = root;
				root.left = null;
				prev = root;
			}
			else {
				prev.right=root;
				root.left = null;
				prev = root;
			}
			BST(rightNode);
		}
		void Traverse (Node root) {
			if (root == null)
				return;
	
			System.out.print(root.data+ " ");
			Traverse(root.right);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		tree.BST(tree.node);
		tree.Traverse(tree.newhead);

	}

}
