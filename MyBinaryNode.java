package com.blz.binarytree;

public class MyBinaryNode<E extends Comparable<E>> {
	E key;
	MyBinaryNode<E> left;
	MyBinaryNode<E> right;

	public MyBinaryNode(E key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}