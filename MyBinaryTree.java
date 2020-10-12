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
}