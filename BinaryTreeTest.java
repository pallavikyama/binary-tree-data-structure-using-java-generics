package com.blz.binarytree;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryTreeTest {
	@Test
	public void binaryTreeTestUC01() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int rootValue = myBinaryTree.getRoot().key;
		assertEquals(rootValue, 56);
		int leftValue = myBinaryTree.getRoot().left.key;
		assertEquals(leftValue, 30);
		int rightValue = myBinaryTree.getRoot().right.key;
		assertEquals(rightValue, 70);
	}

	@Test
	public void binaryTreeTestUC02() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int rootValue = myBinaryTree.getRoot().key;
		assertEquals(rootValue, 56);
		assertEquals(3, myBinaryTree.getSize());
	}

	@Test
	public void binaryTreeTestUC03() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int rootValue = myBinaryTree.getRoot().key;
		assertEquals(rootValue, 56);
		assertEquals(null, myBinaryTree.search(myBinaryTree.getRoot(), 63));
	}
}