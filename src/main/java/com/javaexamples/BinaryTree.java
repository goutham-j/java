package com.javaexamples;

public class BinaryTree {
	
	static class Node {
		int value;
		Node right;
		Node left;

		Node(int value) {
			this.value = value;
			this.right = null;
			this.left = null;
		}
	}
	
	void insert(Node node, int value) {
		
        if (value < node.value) { 
        	if (node.left != null) { 
        		insert(node.left, value); 
        	} else { 
        		System.out.println("Inserted " + value + " to left of " + node.value); 
        		node.left = new Node(value); 
        		} 
        } else if (value > node.value) {
            if (node.right != null) {
              insert(node.right, value);
            } else {
              System.out.println("Inserted " + value + " to right of " + node.value);
              node.right = new Node(value);
            }
        }	
	}
	
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    BinaryTree bt = new BinaryTree();
	    Node root = new Node(8);
	    
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        bt.insert(root, 2);
        bt.insert(root, 4);
        bt.insert(root, 8);
        bt.insert(root, 6);
        bt.insert(root, 7);
        bt.insert(root, 3);
        bt.insert(root, 9);
        
        System.out.println("Traversing tree in order");
        bt.traverseInOrder(root);

	}

}

