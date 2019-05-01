package com.datastructure.binarytree;

import java.util.Stack;

public class BinaryTreeOperations {
	
	public static BinaryTreeNode insert(BinaryTreeNode root, int data) {
		
		
		BinaryTreeNode nodeNew = new BinaryTreeNode(data);
		
		BinaryTreeNode rootNode = root;
		
		BinaryTreeNode nodePointer = null;
		if(rootNode == null) {
			return nodeNew;
		} 
		
		while(rootNode!= null) {
			nodePointer = rootNode;
			if(data < rootNode.getData()) {
				rootNode = rootNode.getLeft();
			} else {
				rootNode = rootNode.getRight();
			}
		}
		
		if(nodePointer == null) {
			nodePointer = nodeNew;
		} if(data < nodePointer.getData()) {
			nodePointer.setLeft(nodeNew);
		} else {
			nodePointer.setRight(nodeNew);
		}
		
		return nodePointer;
		
	}
	
	static void inOrderRecursive(BinaryTreeNode root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	    	inOrderRecursive(root.getLeft());  
	        System.out.print( root.getData() +" ");  
	        inOrderRecursive(root.getRight());  
	    }  
	} 
	
	static void inOrderNonRecursive(BinaryTreeNode root) {
		
		BinaryTreeNode currentNode = root;
		Stack<BinaryTreeNode> binaryTreeStack = new Stack<BinaryTreeNode>();
		
		while(true) {
			while(currentNode != null) {
				binaryTreeStack.push(currentNode);
				currentNode = currentNode.getLeft(); 
			}
			
			if(binaryTreeStack.isEmpty())
				break;
			currentNode = binaryTreeStack.pop();
			System.out.print( currentNode.getData() +" ");
			currentNode = currentNode.getRight();
			
		}
		
	}
	
	static void preOrderRecursive(BinaryTreeNode root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	    	System.out.print( root.getData() +" "); 
	    	preOrderRecursive(root.getLeft());   
	        preOrderRecursive(root.getRight());  
	    }  
	} 
	
	static void preOrderNonRecursive(BinaryTreeNode root) {
		
		BinaryTreeNode currentNode = root;
		Stack<BinaryTreeNode> binaryTreeStack = new Stack<BinaryTreeNode>();
		
		while(true) {
			while(currentNode != null) {
				System.out.print( currentNode.getData() +" ");
				binaryTreeStack.push(currentNode);
				currentNode = currentNode.getLeft(); 	
			}
			
			if(binaryTreeStack.isEmpty())
				break;
			currentNode = binaryTreeStack.pop();
			currentNode = currentNode.getRight();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode binaryTreeNode = new BinaryTreeNode(50);
		insert(binaryTreeNode, 60);
		insert(binaryTreeNode, 30);  
		insert(binaryTreeNode, 20);  
		insert(binaryTreeNode, 40);  
		insert(binaryTreeNode, 70);  
		insert(binaryTreeNode, 10);  
		insert(binaryTreeNode, 80);
		insert(binaryTreeNode, 55);
		
		System.out.print("InorderRecursive :  ");
		inOrderRecursive(binaryTreeNode);
		System.out.print("\nInorderNonRecursive : ");
		inOrderNonRecursive(binaryTreeNode);
		System.out.print("\nPreorderRecursive :  ");
		preOrderRecursive(binaryTreeNode);
		System.out.print("\nPreorderNonRecursive : ");
		preOrderNonRecursive(binaryTreeNode);
		
	}

}
