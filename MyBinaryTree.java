package com.blz.binarytree;

public class MyBinaryTree<E extends Comparable<E>> {
	private MyBinaryNode<E> root;

	public MyBinaryNode<E> getRoot() {
		return this.root;
	}

	// ADD A NEW NODE TO THE BINARY TREE
	public void add(E key) {
		this.root = this.addRecursively(this.root, key);
	}

	private MyBinaryNode<E> addRecursively(MyBinaryNode<E> current, E key) {
		if (current == null)
			current = new MyBinaryNode<E>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else if (compareResult > 0)
			current.right = addRecursively(current.right, key);
		return current;
	}

	// GET SIZE OF THIS BINARY TREE
	public int getSize() {
		return this.getSizeRecursively(this.root);
	}

	private int getSizeRecursively(MyBinaryNode<E> current) {
		if (current == null)
			return 0;
		else
			return 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}

	// SEARCH FOR THE SPECIFIED NODE IN THE BST USING ITS KEY VALUE
	public MyBinaryNode<E> search(MyBinaryNode<E> current, E key) {
		if (current == null || current.key == key)
			return current;
		int compareResult = key.compareTo(current.key);
		if (compareResult < 0)
			return current.left = search(current.left, key);
		return search(current.right, key);
	}
}